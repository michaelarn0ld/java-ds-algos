# Priority Queues
Like an ordinary queue, a priority queue has a front and a rear, and items are
removed from the front. The difference is that in a priority queue, items are
ordered by key value so that the items with the lowest key (some implementations
use the highest key) is at the front of the queue. Items are inserted into proper
position to maintain ordering in the priority queue.

## Efficiency of Priority Queues
Insertion into a priority queue (as it is implemented here) is O(N) time. Removal
from it is O(1).
