# An Array-based Heap
## Purpose
The purpose of this lab is to work with a heap class, modifying the
implementation to gain a greater understanding of the concepts related to heaps.

Pair Programming will be utilized.

## Evaluation
Students will be awarded up to 10 points for successfully completing this lab
as outlined below.

## Prelab
Complete the following questions using your text prior to beginning the lab
activities. Put the answer on the answer sheet you and your partner turn in.

* PL 1 What is a heap data structure? (Use definition from your text)
* PL 2 What is the difference between a minheap and a maxheap?
* PL 3 Look at the diagram at the top of this page.  Is this a min or maxheap?
* PL 4 What is a different definition of a "heap" as used in computer science?
* PL 5 What is a complete binary tree? (Use text definition)

## Step 1: Background
Heaps are very useful storage structures in computer science. They provide
O(logn) insertions and O(logn) retrievals. Every item in the heap is usually
comprised of two parts; a key (which can be used as a priority) and an element.
In this respect they are like a binary search tree.

The definition for a heap—as you should have already discovered by answering
your pre-lab questions—is a binary tree with following properties

1. Must be complete (but not necessarily full)
1. For a maxheap, for each node, the key in the node is >= to both the left and
   right children

### Heap characteristics:
INSERTION: When you insert a new node into a heap, the location is predetermined.
Since a heap must be complete, insert into the first empty location on the
lowest level. Following the insertion, you should "swap to the top" with this
node and its parent until the maxheap property is restored. If the swap doesn’t
result in a heap, you should continue swapping up the tree until the heap
property is restored. This method is completed for you in the lab, but its
concept is shown below.

1. Assume you have a maxheap as shown below:
```
           10
          /  \
         8    7
        / \  /
       5  6 3   <- next available location
```
2. You insert a node with 13 as its key.To retain completeness property, it must
   go below the 7 as its right child. The tree is no longer a maxheap, however,
   since 13 > 7.
```
       10
      /  \
     8    7     13 and 7 violate maxheap property
    / \  / \
   5  6 3   13
```
3. To restore the maxheap property, 13 swaps up (swap to the top) with 7.  This
   results in a subtree rooted in 13 which is a maxheap.
```
       10
      /  \
     8    13
    / \  /  \
   5  6 3    7
```
4. The entire tree (rooted in 10) is still not a heap, however, so the process
   is repeated until 13 arrives at the root.
```
       13
      /  \
     8    10
    / \  / \
   5  6 3   7
```

REMOVAL: When a value is removed from the heap, the location of the key is
predetermined: Always remove the item located in the root location. This would
result in a rootless tree as shown below:
```
          <- root has been removed
      /  \
     8    10
    / \  / \
   5  6 3   7
```
1. To retain the completeness property, the only node that can replace the root
   is the lowest on the right (7), so it becomes the new root.
```
       7
      / \
     8   10
    / \  /
   5  6 3
```
2. We reverse the "swap to top" action to restore heap property; instead using
   a "swap to drop" action. The first swap would be with 7 and 10.
```
       10
      /  \
     8    7
    / \  /
   5  6 3
```
3. If necessary, the swapping would continue until the heap property is restored.
   Fortunately, the single swap does it.

Completing the removal method is the major assignment in the lab.


## Step 2: Study the insert method
For simplicity purposes, the heap we are using inserts and retrieves objects,
not generics.

Study the code for insertion.
* 2.1 Explain how the insertion method works.
* 2.2 Draw the heap as it exists currently in binary tree form.
* Modify your insert method calls in the ```HeapTest.java``` so that you have
  items in your heap with priorities of 4,7,3,8,9,6,5.
* 2.3 Redraw the heap as it exists after inserting these values.

## Step 3: Review the heap remove algorithm
We will test our removal method with the following code:

```
Heap h = new Heap();

//Insert some items
h.insert(new Integer(5),5);
h.insert(new Integer(3),3);
h.insert(new Integer(7),7);
h.insert(new Integer(1),1);
h.insert(new Integer(6),6);
h.insert(new Integer(2),2);
h.insert(new Integer(10),10);

//Remove what's on top
h.remove();
System.out.println("Here is what's on top: "+h.peek());

//See what is in the heap now
System.out.println(h);
```

Based on our insertion algorithm, you should end up with a heap that looks like
this:
```
       10
      /  \
     6    7
    / \  / \
   1   32   5
```
Go back and review the removal steps explained earlier in the lab. Be sure you
understand how the heap removal works!

3.1 Call your instructor over and explain how removal works for a heap.
Obtain your instructor’s initials on your answer sheet.


## Step 4:	Implement a remove method
A pseudocoded remove algorithm—based on the process explained earlier—should
look something like this:
1. Pluck the root by getting the item at location 0 in the tree array
1. Replace the root with the lowest value in the tree—the 5 in the tree we are
   working with.Remember that we are keeping track of the insertion point in the
   tree.Since the insertion point is always next to the last item added, we can
   replace the plucked root with tree[insertPoint – 1]
1. By replacing the root, the shape property has been restored. Unfortunately
   we potentially have a non-heap based on the value we just put in the root
   position.The reHeapify method will solve this problem for us, so in the third
   step you should call the reHeapify method, and then decrement count and
   insertPoint.
1. Since you’ve restored both the shape and heap properties, all that is left to
   do is return the object and you are done.

4.1	When you believe your remove method works, call the instructor over to
demonstrate your program. Obtain your instructor's initials as the answer to
this question.
