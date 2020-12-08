// Amer Din
// December 5, 2020
// BinarySearchTreeBuilder: the java file for building the node and the respective functions

class BinarySearchTreeBuilder {
    BSTNode root;
    Record r;

    //empty constructor that defines the node as null
    BinarySearchTreeBuilder() {
        root = null;
    }

    //create new node function with 2 parameters
    protected BSTNode createNewNode(String keyword, Record recordToAdd) {
        //returns a new binary search tree node with the respective arguments
        return new BSTNode(keyword, recordToAdd);
    }

    public boolean contains(String keyword, Record recordToAdd) {
        //initial variables to check the current node when traversing and also the parent, which initally is set to null
        BSTNode currentNode = root;
        BSTNode parentNode = null;
        // This code needs to check if a keyword already exists as a node in BinarySearchTree
        // IF (key does not exist in the BinarySearchTree) return FALSE
        // ELSE append the recordToAdd to the keyword found in the BinarySearchTree

        //beginning of traversal
        while (currentNode != null) {
            //compare the ascii values of the keyword with the next word
            //left branch
            if (keyword.compareTo(currentNode.keyword) < 0) {
                //track parent for if the instance arises of which the node is not equal to both the left or right node
                parentNode = currentNode;
                currentNode = currentNode.left;
                //right branch for when it is greater
            } else if (keyword.compareTo(currentNode.keyword) > 0) {
                parentNode = currentNode;
                currentNode = currentNode.right;
            } else {
                //append the recordtoAdd for the keyword found in the binary search tree
                //point to the next node
                recordToAdd.next = currentNode.record;
                currentNode.record = recordToAdd;
                return true;
            }

        }

        //false if keyword was never found with a match
        return false;

    }

    void insert(String keyword, FileData fd) {
        // using the FileData reference fd, create an object of Record
        // call contains method
        //creation of record instance
        Record r = new Record(fd.id, fd.title, fd.author, null);
        // IF (contains return False call the overloaded insert method
        if (contains(keyword, r) == false) {
            //creates a new node
            insert(keyword, r);
        }
    }

    boolean insert(String keyword, Record recordToAdd) {
        // IF root is NULL then createNewNode
        // ELSE Traverse the tree to determine where to insert the new keyword
        // Once we know where to insert the new keyword, then call createNewNode method

        //initial placeholders
        BSTNode currentNode = root;
        BSTNode parentNode = null;

        //if root is null
        if (root == null) {
            //create a new node
            root = createNewNode(keyword, recordToAdd);
        } else {
            //beginning of traversal until last node
            while (currentNode != null) {
                //compare the ascii values of the keyword with the next word
                //left branch
                if (keyword.compareTo(currentNode.keyword) < 0) {
                    //track parent for if the instance arises of which the node is not equal to both the left or right node
                    parentNode = currentNode;
                    currentNode = currentNode.left;
                    //reached bottom of tree on the left side
                    if (currentNode == null) {
                        parentNode.left = createNewNode(keyword, recordToAdd);
                        //inserted node at respective spot
                        return false;
                    }
                    //right branch for when it is greater
                } else if (keyword.compareTo(currentNode.keyword) > 0) {
                    parentNode = currentNode;
                    currentNode = currentNode.right;
                    //reached bottom of tree on the right side
                    if (currentNode == null) {
                        parentNode.right = createNewNode(keyword, recordToAdd);
                        //inserted node at respective spot
                        return false;
                    }
                }
            }

        }
        return true;
    }


    public boolean delete(String keyword) {
        // Use delete function from the BST class and code that logic here
        // Locate the node to be deleted and also locate its parent node
        BSTNode parent = null;
        BSTNode current = root;
        while (current != null) {
            if (keyword.compareTo(current.keyword) < 0) {
                parent = current;
                current = current.left;
            } else if (keyword.compareTo(current.keyword) > 0) {
                parent = current;
                current = current.right;
            } else {
                break; // Element is in the tree pointed at by current
            }
        }

        if (current == null) {
            return false;
        }

        // Case 1: current has no left child
        if (current.left == null) {
            // Connect the parent with the right child of the current node
            if (parent == null) {
                root = current.right;
            } else {
                if (keyword.compareTo(parent.keyword) < 0) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }

            }
        }
        // Case 2: The current node has a left child
        else {
            // Locate the rightmost node in the left subtree of the current node and also its parent
            BSTNode parentOfRightMost = current;
            BSTNode rightMost = current.left;

            while (rightMost.right != null) {
                parentOfRightMost = rightMost;
                rightMost = rightMost.right;

            }

            // Replace the element in current by the element in rightMost
            current.keyword = rightMost.keyword;
            current.record = rightMost.record;

            // Eliminate rightmost node
            if (parentOfRightMost.right == rightMost) {
                parentOfRightMost.right = rightMost.left;
            } else {
                // Special case: parentOfRightMost == current
                parentOfRightMost.left = rightMost.left;
            }
        }
        return true; // Element deleted successfully
    }


    public void print() {
        System.out.println("****************** print(Sorted)***************");
        printInOrder(root);
    }

    private void printInOrder(BSTNode var1) {
        //check if there is value for traversal
        if (var1 != null) {
            //travrerse left node
            this.printInOrder(var1.left);
            System.out.println(var1.keyword);
            //traverse right node
            Record var2 = var1.record;
            System.out.print("\t");

            while (var2 != null) {
                System.out.printf("%d|%s|%s ---> ", var2.id, var2.author, var2.title);
                var2 = var2.next;
            }

            System.out.println("null");
            this.printInOrder(var1.right);
        }

    }
}
