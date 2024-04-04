package CS1061HW9;

public class KthAVLTreeDemo<E extends Comparable<E>> extends AVLTree<E> {
  /**
   * Create a default KthAVLTree
   */
  public KthAVLTreeDemo() {
  }

  /**
   * Create an AVL tree from an array of objects
   */
  public KthAVLTreeDemo(E[] objects) {
    super(objects);
  }

  /**
   * Override createNewNode to create an KthAVLTreeNodeNode
   */
  @Override
  protected KthAVLTreeNodeNode<E> createNewNode(E e) {
    return new KthAVLTreeNodeNode<E>(e);
  }

  /**
   * Insert an element and adjust size of node 
   */
  @Override
  public boolean insert(E e) {
//    boolean successful = super.insert(e);
    if (!super.insert(e)) {
      return false; // e is already in the tree
    }
    else {
      updateSizes((KthAVLTreeNodeNode<E>)root); // Update size values from root 
    }
    return true; // e is inserted
  }


   /**
   * Delete an element from the binary tree. 
   * Update the size values and return true if the element is deleted successfully 
   * Return false if the element is not in the tree
   */
  @Override
  public boolean delete(E element) {
    if (super.delete(element)){
        updateSizes((KthAVLTreeNodeNode<E>)root); // Update size values from root 
        return true; // Element deleted
    } else {
        return false; // Element is not in the tree
    }
  }

  /**
   * Return the kth smallest element in the tree
   * @param k
   * @return 
   */
  public E find(int k) {
    return find(k, (KthAVLTreeNodeNode<E>) this.root);
  }

  private E find(int k, KthAVLTreeNodeNode<E> root) {
      
      // to be completed by student
      return null;
  }

  /**
   * adjust size of the nodes in the path from the specified node to the root if
   * necessary
   */
  protected void updateSizes(KthAVLTreeNodeNode<E> A) {
      
//  need to consider nodes tht have been rotated out of path
//  so we do a portorder processing of the entire subtree
    if (A.left != null)
      updateSizes((KthAVLTreeNodeNode<E>)A.left);
    if (A.right != null)
      updateSizes((KthAVLTreeNodeNode<E>)A.right);

    A.updateSize();

  }
  /**
   * KthAVLTreeNodeNode is TreeNode plus size
   */
  protected static class KthAVLTreeNodeNode<E extends Comparable<E>> extends
      AVLTreeNode<E> {

    private int size = 0;

    public KthAVLTreeNodeNode(E o) {
      super(o);
    }
    
     private void updateSize() {

      // to be completed by student
  }
  }
}