package com.github.KluevJakov.myinternship;

import com.github.KluevJakov.myinternship.tasks.AnagramsTask;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramsTest {
    @Test
    public void lowerCheck() {
        assertTrue(AnagramsTask.isAnagram("anagram","margana"));
    }

    @Test
    public void upperCheck() {
        assertTrue(AnagramsTask.isAnagram("ANAGRAM","MARGANA"));
    }

    @Test
    public void differentCheck() {
        assertTrue(AnagramsTask.isAnagram("aNaGrAm","MaRgAnA"));
    }

    @Test
    public void notAnagramCheck() {
        assertFalse(AnagramsTask.isAnagram("aNaGrHm","MaRgAnA"));
    }

    @Test
    public void differentSizeCheck() {
        assertFalse(AnagramsTask.isAnagram("aNaGrAmA","MaRgAnA"));
    }
}
