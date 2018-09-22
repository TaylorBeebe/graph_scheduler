# graph_scheduler
Uses directed graphs to schedule overlapping events such that no attendee has any conflicts

BFSComponentSize.java: Performes a breadth first search on a graph
DFSComponentSize.java: Performes a depth first search on a graph
ExamScheduler.java: This can have large.txt loaded into it and schedule exams such that there are no conflicts.
                    The main function does a normal algorithm, and a much more computationally intensive "optimal"
                    algorithm on the dataset.
Student.java: Holds information about each student.
StudentNameComparator: Custom comparison used when sorting students
StudentVector.java: Custom vector class that sorts students based on the comparator passed in
