package edu.ncsu.csc316.dsa.manager;

import edu.ncsu.csc316.dsa.data.Student;
import edu.ncsu.csc316.dsa.io.StudentReader;
import edu.ncsu.csc316.dsa.sorter.InsertionSorter;
import edu.ncsu.csc316.dsa.sorter.Sorter;

/**
 * StudentManager manages information about Students. StudentManager
 * can sort a Student roster.
 * @author Dr. King
 *
 */
public class StudentManager {

    /**
     * A roster of students in the system
     */
    private Student[] roster;
    
    /**
     * The sorting algorithm to use when sorting
     */
    private Sorter<Student> sorter;
    
    /**
     * Initializes a StudentManager
     * @param pathToFile - the path to the input student CSV file
     */
    public StudentManager(String pathToFile)
    {
        roster = StudentReader.readInputAsArray(pathToFile);
        sorter = new InsertionSorter<Student>();
    }
        
    /**
     * Returns a sorted array of Students
     *
     * @return the sorted array of Students
     */
    public Student[] sort()
    {
        sorter.sort(roster);
        return roster;
    }
  
}