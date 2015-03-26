/*
 * Tanaguru - Automated webpage assessment
 * Copyright (C) 2008-2015  Tanaguru.org
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact us by mail: tanaguru AT tanaguru DOT org
 */
package org.opens.tanaguru.rules.rgaa30;

import org.opens.tanaguru.entity.audit.*;
import org.opens.tanaguru.rules.rgaa30.test.Rgaa30RuleImplementationTestCase;
import static org.opens.tanaguru.rules.keystore.MarkerStore.DECORATIVE_IMAGE_MARKER;
import static org.opens.tanaguru.rules.keystore.MarkerStore.INFORMATIVE_IMAGE_MARKER;

/**
 * Unit test class for the implementation of the rule 01.02.03 of the referential Rgaa 3.0.
 *
 * @author jkowalczyk
 */
public class Rgaa30Rule010203Test extends Rgaa30RuleImplementationTestCase {

    /**
     * Default constructor
     */
    public Rgaa30Rule010203Test (String testName){
        super(testName);
    }

    @Override
    protected void setUpRuleImplementationClassName() {
        setRuleImplementationClassName(
                "org.opens.tanaguru.rules.rgaa30.Rgaa30Rule010203");
    }

    @Override
    protected void setUpWebResourceMap() {
        getWebResourceMap().put("Rgaa30.Test.1.2.3-1Passed-01",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule010203/Rgaa30.Test.1.2.3-1Passed-01.html"));
        addParameterToParameterMap("Rgaa30.Test.1.2.3-1Passed-01", createParameter("Rules", DECORATIVE_IMAGE_MARKER, "id-decorative-object"));
        getWebResourceMap().put("Rgaa30.Test.1.2.3-1Passed-02",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule010203/Rgaa30.Test.1.2.3-1Passed-02.html"));
        addParameterToParameterMap("Rgaa30.Test.1.2.3-1Passed-02", createParameter("Rules", DECORATIVE_IMAGE_MARKER, "class-decorative-object"));
        getWebResourceMap().put("Rgaa30.Test.1.2.3-1Passed-03",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule010203/Rgaa30.Test.1.2.3-1Passed-03.html"));
        addParameterToParameterMap("Rgaa30.Test.1.2.3-1Passed-03", createParameter("Rules", DECORATIVE_IMAGE_MARKER, "role-decorative-object"));
        getWebResourceMap().put("Rgaa30.Test.1.2.3-1Passed-04",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule010203/Rgaa30.Test.1.2.3-1Passed-04.html"));
        addParameterToParameterMap("Rgaa30.Test.1.2.3-1Passed-04", createParameter("Rules", DECORATIVE_IMAGE_MARKER, "id-decorative-object; class-decorative-object; role-decorative-object"));
        getWebResourceMap().put("Rgaa30.Test.1.2.3-1Passed-05",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule010203/Rgaa30.Test.1.2.3-1Passed-05.html"));
        addParameterToParameterMap("Rgaa30.Test.1.2.3-1Passed-05", createParameter("Rules", DECORATIVE_IMAGE_MARKER, "id-decorative-object"));
        addParameterToParameterMap("Rgaa30.Test.1.2.3-1Passed-05", createParameter("Rules", INFORMATIVE_IMAGE_MARKER, "class-informative-object"));

        getWebResourceMap().put("Rgaa30.Test.1.2.3-2Failed-01",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule010203/Rgaa30.Test.1.2.3-2Failed-01.html"));
        addParameterToParameterMap("Rgaa30.Test.1.2.3-2Failed-01", createParameter("Rules", DECORATIVE_IMAGE_MARKER, "id-decorative-object"));
        getWebResourceMap().put("Rgaa30.Test.1.2.3-2Failed-02",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule010203/Rgaa30.Test.1.2.3-2Failed-02.html"));
        addParameterToParameterMap("Rgaa30.Test.1.2.3-2Failed-02", createParameter("Rules", DECORATIVE_IMAGE_MARKER, "class-decorative-object"));
        getWebResourceMap().put("Rgaa30.Test.1.2.3-2Failed-03",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule010203/Rgaa30.Test.1.2.3-2Failed-03.html"));
        addParameterToParameterMap("Rgaa30.Test.1.2.3-2Failed-03", createParameter("Rules", DECORATIVE_IMAGE_MARKER, "role-decorative-object"));
        getWebResourceMap().put("Rgaa30.Test.1.2.3-2Failed-04",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule010203/Rgaa30.Test.1.2.3-2Failed-04.html"));
        addParameterToParameterMap("Rgaa30.Test.1.2.3-2Failed-04", createParameter("Rules", DECORATIVE_IMAGE_MARKER, "id-decorative-object; class-decorative-object; role-decorative-object"));
        getWebResourceMap().put("Rgaa30.Test.1.2.3-2Failed-05",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule010203/Rgaa30.Test.1.2.3-2Failed-05.html"));
        addParameterToParameterMap("Rgaa30.Test.1.2.3-2Failed-05", createParameter("Rules", DECORATIVE_IMAGE_MARKER, "id-decorative-object"));
        addParameterToParameterMap("Rgaa30.Test.1.2.3-2Failed-05", createParameter("Rules", INFORMATIVE_IMAGE_MARKER, "class-informative-object"));
        
        getWebResourceMap().put("Rgaa30.Test.1.2.3-3NMI-01",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule010203/Rgaa30.Test.1.2.3-3NMI-01.html"));
        getWebResourceMap().put("Rgaa30.Test.1.2.3-3NMI-02",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule010203/Rgaa30.Test.1.2.3-3NMI-02.html"));
        getWebResourceMap().put("Rgaa30.Test.1.2.3-3NMI-03",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule010203/Rgaa30.Test.1.2.3-3NMI-03.html"));
        addParameterToParameterMap("Rgaa30.Test.1.2.3-3NMI-03", createParameter("Rules", INFORMATIVE_IMAGE_MARKER, "class-informative-object"));
        getWebResourceMap().put("Rgaa30.Test.1.2.3-3NMI-04",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule010203/Rgaa30.Test.1.2.3-3NMI-04.html"));
        addParameterToParameterMap("Rgaa30.Test.1.2.3-3NMI-04", createParameter("Rules", INFORMATIVE_IMAGE_MARKER, "class-informative-object"));
        getWebResourceMap().put("Rgaa30.Test.1.2.3-3NMI-05",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule010203/Rgaa30.Test.1.2.3-3NMI-05.html"));
        addParameterToParameterMap("Rgaa30.Test.1.2.3-3NMI-05", createParameter("Rules", DECORATIVE_IMAGE_MARKER, "id-decorative-object"));
        getWebResourceMap().put("Rgaa30.Test.1.2.3-3NMI-06",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule010203/Rgaa30.Test.1.2.3-3NMI-06.html"));
        addParameterToParameterMap("Rgaa30.Test.1.2.3-3NMI-06", createParameter("Rules", DECORATIVE_IMAGE_MARKER, "class-decorative-object"));
        
        getWebResourceMap().put("Rgaa30.Test.1.2.3-4NA-01",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule010203/Rgaa30.Test.1.2.3-4NA-01.html"));
        getWebResourceMap().put("Rgaa30.Test.1.2.3-4NA-02",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule010203/Rgaa30.Test.1.2.3-4NA-02.html"));
        getWebResourceMap().put("Rgaa30.Test.1.2.3-4NA-03",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule010203/Rgaa30.Test.1.2.3-4NA-03.html"));
        getWebResourceMap().put("Rgaa30.Test.1.2.3-4NA-04",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule010203/Rgaa30.Test.1.2.3-4NA-04.html"));
        getWebResourceMap().put("Rgaa30.Test.1.2.3-4NA-05",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule010203/Rgaa30.Test.1.2.3-4NA-05.html"));
    }

    @Override
    protected void setProcess() {
        //----------------------------------------------------------------------
        //------------------------------1Passed-01------------------------------
        //----------------------------------------------------------------------
        ProcessResult processResult = processPageTest("Rgaa30.Test.1.2.3-1Passed-01");
        // check test result
        assertEquals(TestSolution.PASSED, processResult.getValue());
        // check test has no remark
        assertNull(processResult.getRemarkSet());
        // check number of elements in the page
        assertEquals(1, processResult.getElementCounter());
        
        
        //----------------------------------------------------------------------
        //------------------------------1Passed-02------------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.1.2.3-1Passed-02");
        // check test result
        assertEquals(TestSolution.NOT_TESTED, processResult.getValue());
        // check test has no remark
        assertNull(processResult.getRemarkSet());
        // check number of elements in the page
        assertEquals(1, processResult.getElementCounter());
        
        
        //----------------------------------------------------------------------
        //------------------------------1Passed-03------------------------------
        //----------------------------------------------------------------------
//        processResult = processPageTest("Rgaa30.Test.1.2.3-1Passed-03");
//        // check test result
//        assertEquals(TestSolution.PASSED, processResult.getValue());
//        // check test has no remark
//        assertNull(processResult.getRemarkSet());
//        // check number of elements in the page
//        assertEquals(1, processResult.getElementCounter());
//        
//        
//        //----------------------------------------------------------------------
//        //------------------------------1Passed-04------------------------------
//        //----------------------------------------------------------------------
//        processResult = processPageTest("Rgaa30.Test.1.2.3-1Passed-04");
//        // check test result
//        assertEquals(TestSolution.PASSED, processResult.getValue());
//        // check test has no remark
//        assertNull(processResult.getRemarkSet());
//        // check number of elements in the page
//        assertEquals(3, processResult.getElementCounter());
//        
//        
//        //----------------------------------------------------------------------
//        //------------------------------1Passed-05------------------------------
//        //----------------------------------------------------------------------
//        processResult = processPageTest("Rgaa30.Test.1.2.3-1Passed-05");
//        // check test result
//        assertEquals(TestSolution.PASSED, processResult.getValue());
//        // check test has no remark
//        assertNull(processResult.getRemarkSet());
//        // check number of elements in the page
//        assertEquals(1, processResult.getElementCounter());
//        
//
//        //----------------------------------------------------------------------
//        //------------------------------2Failed-01------------------------------
//        //----------------------------------------------------------------------
//        processResult = processPageTest("Rgaa30.Test.1.2.3-2Failed-01");
//        // check number of elements in the page
//        assertEquals(1, processResult.getElementCounter());
//        // check test result
//        assertEquals(TestSolution.FAILED, processResult.getValue());
//        // check number of remarks and their value
//        assertEquals(1, processResult.getRemarkSet().size());
//        SourceCodeRemark processRemark = ((SourceCodeRemark)((LinkedHashSet)processResult.getRemarkSet()).iterator().next());
//        assertEquals(RemarkMessageStore.DECORATIVE_ELEMENT_WITH_NOT_EMPTY_ALT_MSG, processRemark.getMessageCode());
//        assertEquals(TestSolution.FAILED, processRemark.getIssue());
//        assertEquals(HtmlElementStore.OBJECT_ELEMENT, processRemark.getTarget());
//        assertNotNull(processRemark.getSnippet());
//        // check number of evidence elements and their value
//        assertEquals(2, processRemark.getElementList().size());
//        Iterator<EvidenceElement> iter = processRemark.getElementList().iterator();
//        EvidenceElement ee = iter.next();
//        assertTrue(StringUtils.contains(ee.getValue(), "Not empty alternative"));
//        assertEquals(HtmlElementStore.TEXT_ELEMENT2, ee.getEvidence().getCode());
//        ee = iter.next();
//        assertTrue(StringUtils.contains(ee.getValue(), "mock_image.gif"));
//        assertEquals(DATA_ATTR, ee.getEvidence().getCode());
//
//
//        //----------------------------------------------------------------------
//        //------------------------------2Failed-02------------------------------
//        //----------------------------------------------------------------------
//        processResult = processPageTest("Rgaa30.Test.1.2.3-2Failed-02");
//        // check number of elements in the page
//        assertEquals(1, processResult.getElementCounter());
//        // check test result
//        assertEquals(TestSolution.FAILED, processResult.getValue());
//        // check number of remarks and their value
//        assertEquals(1, processResult.getRemarkSet().size());
//        processRemark = ((SourceCodeRemark)((LinkedHashSet)processResult.getRemarkSet()).iterator().next());
//        assertEquals(RemarkMessageStore.DECORATIVE_ELEMENT_WITH_NOT_EMPTY_ALT_MSG, processRemark.getMessageCode());
//        assertEquals(TestSolution.FAILED, processRemark.getIssue());
//        assertEquals(HtmlElementStore.OBJECT_ELEMENT, processRemark.getTarget());
//        assertNotNull(processRemark.getSnippet());
//        // check number of evidence elements and their value
//        assertEquals(2, processRemark.getElementList().size());
//        iter = processRemark.getElementList().iterator();
//        ee = iter.next();
//        assertTrue(StringUtils.contains(ee.getValue(), "Not empty alternative"));
//        assertEquals(HtmlElementStore.TEXT_ELEMENT2, ee.getEvidence().getCode());
//        ee = iter.next();
//        assertTrue(StringUtils.contains(ee.getValue(), "mock_image.gif"));
//        assertEquals(DATA_ATTR, ee.getEvidence().getCode());
//        
//
//        //----------------------------------------------------------------------
//        //------------------------------2Failed-03------------------------------
//        //----------------------------------------------------------------------
//        processResult = processPageTest("Rgaa30.Test.1.2.3-2Failed-03");
//        // check number of elements in the page
//        assertEquals(1, processResult.getElementCounter());
//        // check test result
//        assertEquals(TestSolution.FAILED, processResult.getValue());
//        // check number of remarks and their value
//        assertEquals(1, processResult.getRemarkSet().size());
//        processRemark = ((SourceCodeRemark)((LinkedHashSet)processResult.getRemarkSet()).iterator().next());
//        assertEquals(RemarkMessageStore.DECORATIVE_ELEMENT_WITH_NOT_EMPTY_ALT_MSG, processRemark.getMessageCode());
//        assertEquals(TestSolution.FAILED, processRemark.getIssue());
//        assertEquals(HtmlElementStore.OBJECT_ELEMENT, processRemark.getTarget());
//        assertNotNull(processRemark.getSnippet());
//        // check number of evidence elements and their value
//        assertEquals(2, processRemark.getElementList().size());
//        iter = processRemark.getElementList().iterator();
//        ee = iter.next();
//        assertTrue(StringUtils.contains(ee.getValue(), "Not empty alternative"));
//        assertEquals(HtmlElementStore.TEXT_ELEMENT2, ee.getEvidence().getCode());
//        ee = iter.next();
//        assertTrue(StringUtils.contains(ee.getValue(), "mock_image.gif"));
//        assertEquals(DATA_ATTR, ee.getEvidence().getCode());
//        
//
//        //----------------------------------------------------------------------
//        //------------------------------2Failed-04------------------------------
//        //----------------------------------------------------------------------
//        processResult = processPageTest("Rgaa30.Test.1.2.3-2Failed-04");
//        // check number of elements in the page
//        assertEquals(3, processResult.getElementCounter());
//        // check test result
//        assertEquals(TestSolution.FAILED, processResult.getValue());
//        // check number of remarks and their value
//        assertEquals(3, processResult.getRemarkSet().size());
//        Iterator<ProcessRemark> pIter = processResult.getRemarkSet().iterator();
//        
//        processRemark = (SourceCodeRemark)pIter.next();
//        assertEquals(RemarkMessageStore.DECORATIVE_ELEMENT_WITH_NOT_EMPTY_ALT_MSG, processRemark.getMessageCode());
//        assertEquals(TestSolution.FAILED, processRemark.getIssue());
//        assertEquals(HtmlElementStore.OBJECT_ELEMENT, processRemark.getTarget());
//        assertNotNull(processRemark.getSnippet());
//        // check number of evidence elements and their value
//        assertEquals(2, processRemark.getElementList().size());
//        iter = processRemark.getElementList().iterator();
//        ee = iter.next();
//        assertTrue(StringUtils.contains(ee.getValue(), "Not empty alternative"));
//        assertEquals(HtmlElementStore.TEXT_ELEMENT2, ee.getEvidence().getCode());
//        ee = iter.next();
//        assertTrue(StringUtils.contains(ee.getValue(), "mock_image1.gif"));
//        assertEquals(DATA_ATTR, ee.getEvidence().getCode());
//        
//        processRemark = (SourceCodeRemark)pIter.next();
//        assertEquals(RemarkMessageStore.DECORATIVE_ELEMENT_WITH_NOT_EMPTY_ALT_MSG, processRemark.getMessageCode());
//        assertEquals(TestSolution.FAILED, processRemark.getIssue());
//        assertEquals(HtmlElementStore.OBJECT_ELEMENT, processRemark.getTarget());
//        assertNotNull(processRemark.getSnippet());
//        // check number of evidence elements and their value
//        assertEquals(2, processRemark.getElementList().size());
//        iter = processRemark.getElementList().iterator();
//        ee = iter.next();
//        assertTrue(StringUtils.contains(ee.getValue(), "Not empty alternative"));
//        assertEquals(HtmlElementStore.TEXT_ELEMENT2, ee.getEvidence().getCode());
//        ee = iter.next();
//        assertTrue(StringUtils.contains(ee.getValue(), "mock_image2.gif"));
//        assertEquals(DATA_ATTR, ee.getEvidence().getCode());
//        
//        processRemark = (SourceCodeRemark)pIter.next();
//        assertEquals(RemarkMessageStore.DECORATIVE_ELEMENT_WITH_NOT_EMPTY_ALT_MSG, processRemark.getMessageCode());
//        assertEquals(TestSolution.FAILED, processRemark.getIssue());
//        assertEquals(HtmlElementStore.OBJECT_ELEMENT, processRemark.getTarget());
//        assertNotNull(processRemark.getSnippet());
//        // check number of evidence elements and their value
//        assertEquals(2, processRemark.getElementList().size());
//        iter = processRemark.getElementList().iterator();
//        ee = iter.next();
//        assertTrue(StringUtils.contains(ee.getValue(), "Not empty alternative"));
//        assertEquals(HtmlElementStore.TEXT_ELEMENT2, ee.getEvidence().getCode());
//        ee = iter.next();
//        assertTrue(StringUtils.contains(ee.getValue(), "mock_image3.gif"));
//        assertEquals(DATA_ATTR, ee.getEvidence().getCode());
//        
//
//        //----------------------------------------------------------------------
//        //------------------------------2Failed-05------------------------------
//        //----------------------------------------------------------------------
//        processResult = processPageTest("Rgaa30.Test.1.2.3-2Failed-05");
//        // check number of elements in the page
//        assertEquals(1, processResult.getElementCounter());
//        // check test result
//        assertEquals(TestSolution.FAILED, processResult.getValue());
//        // check number of remarks and their value
//        assertEquals(1, processResult.getRemarkSet().size());
//        processRemark = ((SourceCodeRemark)((LinkedHashSet)processResult.getRemarkSet()).iterator().next());
//        assertEquals(RemarkMessageStore.DECORATIVE_ELEMENT_WITH_NOT_EMPTY_ALT_MSG, processRemark.getMessageCode());
//        assertEquals(TestSolution.FAILED, processRemark.getIssue());
//        assertEquals(HtmlElementStore.OBJECT_ELEMENT, processRemark.getTarget());
//        assertNotNull(processRemark.getSnippet());
//        // check number of evidence elements and their value
//        assertEquals(2, processRemark.getElementList().size());
//        iter = processRemark.getElementList().iterator();
//        ee = iter.next();
//        assertTrue(StringUtils.contains(ee.getValue(), "Not empty alternative"));
//        assertEquals(HtmlElementStore.TEXT_ELEMENT2, ee.getEvidence().getCode());
//        ee = iter.next();
//        assertTrue(StringUtils.contains(ee.getValue(), "mock_image1.gif"));
//        assertEquals(DATA_ATTR, ee.getEvidence().getCode());
//        
//
//        //----------------------------------------------------------------------
//        //------------------------------3NMI-01---------------------------------
//        //----------------------------------------------------------------------
//        processResult = processPageTest("Rgaa30.Test.1.2.3-3NMI-01");
//        // check number of elements in the page
//        assertEquals(1, processResult.getElementCounter());
//        // check test result
//        assertEquals(TestSolution.NEED_MORE_INFO, processResult.getValue());
//        // check number of remarks and their value
//        assertEquals(1, processResult.getRemarkSet().size());
//        processRemark = ((SourceCodeRemark)((LinkedHashSet)processResult.getRemarkSet()).iterator().next());
//        assertEquals(RemarkMessageStore.CHECK_ELEMENT_WITH_NOT_EMPTY_ALT_MSG, processRemark.getMessageCode());
//        assertEquals(TestSolution.NEED_MORE_INFO, processRemark.getIssue());
//        assertEquals(HtmlElementStore.OBJECT_ELEMENT, processRemark.getTarget());
//        assertNotNull(processRemark.getSnippet());
//        // check number of evidence elements and their value
//        assertEquals(2, processRemark.getElementList().size());
//        iter = processRemark.getElementList().iterator();
//        ee = iter.next();
//        assertTrue(StringUtils.contains(ee.getValue(), ""));
//        assertEquals(HtmlElementStore.TEXT_ELEMENT2, ee.getEvidence().getCode());
//        ee = iter.next();
//        assertTrue(StringUtils.contains(ee.getValue(), "mock_image.gif"));
//        assertEquals(DATA_ATTR, ee.getEvidence().getCode());
//        
//
//        //----------------------------------------------------------------------
//        //------------------------------3NMI-02---------------------------------
//        //----------------------------------------------------------------------
//        processResult = processPageTest("Rgaa30.Test.1.2.3-3NMI-02");
//        // check number of elements in the page
//        assertEquals(1, processResult.getElementCounter());
//        // check test result
//        assertEquals(TestSolution.NEED_MORE_INFO, processResult.getValue());
//        // check number of remarks and their value
//        assertEquals(1, processResult.getRemarkSet().size());
//        processRemark = ((SourceCodeRemark)((LinkedHashSet)processResult.getRemarkSet()).iterator().next());
//        assertEquals(RemarkMessageStore.CHECK_ELEMENT_WITH_EMPTY_ALT_MSG, processRemark.getMessageCode());
//        assertEquals(TestSolution.NEED_MORE_INFO, processRemark.getIssue());
//        assertEquals(HtmlElementStore.OBJECT_ELEMENT, processRemark.getTarget());
//        assertNotNull(processRemark.getSnippet());
//        // check number of evidence elements and their value
//        assertEquals(2, processRemark.getElementList().size());
//        iter = processRemark.getElementList().iterator();
//        ee = iter.next();
//        assertTrue(StringUtils.contains(ee.getValue(), ""));
//        assertEquals(HtmlElementStore.TEXT_ELEMENT2, ee.getEvidence().getCode());
//        ee = iter.next();
//        assertTrue(StringUtils.contains(ee.getValue(), "mock_image.gif"));
//        assertEquals(DATA_ATTR, ee.getEvidence().getCode());
//        
//
//        //----------------------------------------------------------------------
//        //------------------------------3NMI-03---------------------------------
//        //----------------------------------------------------------------------
//        processResult = processPageTest("Rgaa30.Test.1.2.3-3NMI-03");
//        // check number of elements in the page
//        assertEquals(1, processResult.getElementCounter());
//        // check test result
//        assertEquals(TestSolution.NEED_MORE_INFO, processResult.getValue());
//        // check number of remarks and their value
//        assertEquals(1, processResult.getRemarkSet().size());
//        processRemark = ((SourceCodeRemark)((LinkedHashSet)processResult.getRemarkSet()).iterator().next());
//        assertEquals(RemarkMessageStore.CHECK_ELEMENT_WITH_NOT_EMPTY_ALT_MSG, processRemark.getMessageCode());
//        assertEquals(TestSolution.NEED_MORE_INFO, processRemark.getIssue());
//        assertEquals(HtmlElementStore.OBJECT_ELEMENT, processRemark.getTarget());
//        assertNotNull(processRemark.getSnippet());
//        // check number of evidence elements and their value
//        assertEquals(2, processRemark.getElementList().size());
//        iter = processRemark.getElementList().iterator();
//        ee = iter.next();
//        assertTrue(StringUtils.contains(ee.getValue(), ""));
//        assertEquals(HtmlElementStore.TEXT_ELEMENT2, ee.getEvidence().getCode());
//        ee = iter.next();
//        assertTrue(StringUtils.contains(ee.getValue(), "mock_image1.gif"));
//        assertEquals(DATA_ATTR, ee.getEvidence().getCode());
//        
//
//        //----------------------------------------------------------------------
//        //------------------------------3NMI-04---------------------------------
//        //----------------------------------------------------------------------
//        processResult = processPageTest("Rgaa30.Test.1.2.3-3NMI-04");
//        // check number of elements in the page
//        assertEquals(1, processResult.getElementCounter());
//        // check test result
//        assertEquals(TestSolution.NEED_MORE_INFO, processResult.getValue());
//        // check number of remarks and their value
//        assertEquals(1, processResult.getRemarkSet().size());
//        processRemark = ((SourceCodeRemark)((LinkedHashSet)processResult.getRemarkSet()).iterator().next());
//        assertEquals(RemarkMessageStore.CHECK_ELEMENT_WITH_EMPTY_ALT_MSG, processRemark.getMessageCode());
//        assertEquals(TestSolution.NEED_MORE_INFO, processRemark.getIssue());
//        assertEquals(HtmlElementStore.OBJECT_ELEMENT, processRemark.getTarget());
//        assertNotNull(processRemark.getSnippet());
//        // check number of evidence elements and their value
//        assertEquals(2, processRemark.getElementList().size());
//        iter = processRemark.getElementList().iterator();
//        ee = iter.next();
//        assertTrue(StringUtils.contains(ee.getValue(), ""));
//        assertEquals(HtmlElementStore.TEXT_ELEMENT2, ee.getEvidence().getCode());
//        ee = iter.next();
//        assertTrue(StringUtils.contains(ee.getValue(), "mock_image1.gif"));
//        assertEquals(DATA_ATTR, ee.getEvidence().getCode());
//        
//
//        //----------------------------------------------------------------------
//        //------------------------------3NMI-05---------------------------------
//        //----------------------------------------------------------------------
//        processResult = processPageTest("Rgaa30.Test.1.2.3-3NMI-05");
//        // check number of elements in the page
//        assertEquals(2, processResult.getElementCounter());
//        // check test result
//        assertEquals(TestSolution.NEED_MORE_INFO, processResult.getValue());
//        // check number of remarks and their value
//        assertEquals(1, processResult.getRemarkSet().size());
//        processRemark = ((SourceCodeRemark)((LinkedHashSet)processResult.getRemarkSet()).iterator().next());
//        assertEquals(RemarkMessageStore.CHECK_ELEMENT_WITH_NOT_EMPTY_ALT_MSG, processRemark.getMessageCode());
//        assertEquals(TestSolution.NEED_MORE_INFO, processRemark.getIssue());
//        assertEquals(HtmlElementStore.OBJECT_ELEMENT, processRemark.getTarget());
//        assertNotNull(processRemark.getSnippet());
//        // check number of evidence elements and their value
//        assertEquals(2, processRemark.getElementList().size());
//        iter = processRemark.getElementList().iterator();
//        ee = iter.next();
//        assertTrue(StringUtils.contains(ee.getValue(), ""));
//        assertEquals(HtmlElementStore.TEXT_ELEMENT2, ee.getEvidence().getCode());
//        ee = iter.next();
//        assertTrue(StringUtils.contains(ee.getValue(), "mock_image1.gif"));
//        assertEquals(DATA_ATTR, ee.getEvidence().getCode());
//        
//
//        //----------------------------------------------------------------------
//        //------------------------------3NMI-06---------------------------------
//        //----------------------------------------------------------------------
//        processResult = processPageTest("Rgaa30.Test.1.2.3-3NMI-06");
//        // check number of elements in the page
//        assertEquals(2, processResult.getElementCounter());
//        // check test result
//        assertEquals(TestSolution.NEED_MORE_INFO, processResult.getValue());
//        // check number of remarks and their value
//        assertEquals(1, processResult.getRemarkSet().size());
//        processRemark = ((SourceCodeRemark)((LinkedHashSet)processResult.getRemarkSet()).iterator().next());
//        assertEquals(RemarkMessageStore.CHECK_ELEMENT_WITH_EMPTY_ALT_MSG, processRemark.getMessageCode());
//        assertEquals(TestSolution.NEED_MORE_INFO, processRemark.getIssue());
//        assertEquals(HtmlElementStore.OBJECT_ELEMENT, processRemark.getTarget());
//        assertNotNull(processRemark.getSnippet());
//        // check number of evidence elements and their value
//        assertEquals(2, processRemark.getElementList().size());
//        iter = processRemark.getElementList().iterator();
//        ee = iter.next();
//        assertTrue(StringUtils.contains(ee.getValue(), ""));
//        assertEquals(HtmlElementStore.TEXT_ELEMENT2, ee.getEvidence().getCode());
//        ee = iter.next();
//        assertTrue(StringUtils.contains(ee.getValue(), "mock_image1.gif"));
//        assertEquals(DATA_ATTR, ee.getEvidence().getCode());
//        
//        
//        //----------------------------------------------------------------------
//        //------------------------------4NA-01----------------------------------
//        //----------------------------------------------------------------------
//        processResult = processPageTest("Rgaa30.Test.1.2.3-4NA-01");
//        // check test result
//        assertEquals(TestSolution.NOT_APPLICABLE, processResult.getValue());
//        // check test has no remark
//        assertNull(processResult.getRemarkSet());
//        // check number of elements in the page
//        assertEquals(0, processResult.getElementCounter());
//        
//        
//        //----------------------------------------------------------------------
//        //------------------------------4NA-02----------------------------------
//        //----------------------------------------------------------------------
//        processResult = processPageTest("Rgaa30.Test.1.2.3-4NA-02");
//        // check test result
//        assertEquals(TestSolution.NOT_APPLICABLE, processResult.getValue());
//        // check test has no remark
//        assertNull(processResult.getRemarkSet());
//        // check number of elements in the page
//        assertEquals(0, processResult.getElementCounter());
//        
//        
//        //----------------------------------------------------------------------
//        //------------------------------4NA-03----------------------------------
//        //----------------------------------------------------------------------
//        processResult = processPageTest("Rgaa30.Test.1.2.3-4NA-03");
//        // check test result
//        assertEquals(TestSolution.NOT_APPLICABLE, processResult.getValue());
//        // check test has no remark
//        assertNull(processResult.getRemarkSet());
//        // check number of elements in the page
//        assertEquals(0, processResult.getElementCounter());
//        
//        
//        //----------------------------------------------------------------------
//        //------------------------------4NA-04----------------------------------
//        //----------------------------------------------------------------------
//        processResult = processPageTest("Rgaa30.Test.1.2.3-4NA-04");
//        // check test result
//        assertEquals(TestSolution.NOT_APPLICABLE, processResult.getValue());
//        // check test has no remark
//        assertNull(processResult.getRemarkSet());
//        // check number of elements in the page
//        assertEquals(0, processResult.getElementCounter());
//        
//        
//        //----------------------------------------------------------------------
//        //------------------------------4NA-05----------------------------------
//        //----------------------------------------------------------------------
//        processResult = processPageTest("Rgaa30.Test.1.2.3-4NA-05");
//        // check test result
//        assertEquals(TestSolution.NOT_APPLICABLE, processResult.getValue());
//        // check test has no remark
//        assertNull(processResult.getRemarkSet());
//        // check number of elements in the page
//        assertEquals(0, processResult.getElementCounter());
    }

    @Override
    protected void setConsolidate() {
        assertEquals(TestSolution.NOT_TESTED,
                consolidate("Rgaa30.Test.1.2.3-1Passed-01").getValue());
//        assertEquals(TestSolution.PASSED,
//                consolidate("Rgaa30.Test.1.2.3-1Passed-02").getValue());
//        assertEquals(TestSolution.PASSED,
//                consolidate("Rgaa30.Test.1.2.3-1Passed-03").getValue());
//        assertEquals(TestSolution.PASSED,
//                consolidate("Rgaa30.Test.1.2.3-1Passed-04").getValue());
//        assertEquals(TestSolution.PASSED,
//                consolidate("Rgaa30.Test.1.2.3-1Passed-05").getValue());
//        assertEquals(TestSolution.FAILED,
//                consolidate("Rgaa30.Test.1.2.3-2Failed-01").getValue());
//        assertEquals(TestSolution.FAILED,
//                consolidate("Rgaa30.Test.1.2.3-2Failed-02").getValue());
//        assertEquals(TestSolution.FAILED,
//                consolidate("Rgaa30.Test.1.2.3-2Failed-03").getValue());
//        assertEquals(TestSolution.FAILED,
//                consolidate("Rgaa30.Test.1.2.3-2Failed-04").getValue());
//        assertEquals(TestSolution.FAILED,
//                consolidate("Rgaa30.Test.1.2.3-2Failed-05").getValue());
//        assertEquals(TestSolution.NEED_MORE_INFO,
//                consolidate("Rgaa30.Test.1.2.3-3NMI-01").getValue());
//        assertEquals(TestSolution.NEED_MORE_INFO,
//                consolidate("Rgaa30.Test.1.2.3-3NMI-02").getValue());
//        assertEquals(TestSolution.NEED_MORE_INFO,
//                consolidate("Rgaa30.Test.1.2.3-3NMI-03").getValue());
//        assertEquals(TestSolution.NEED_MORE_INFO,
//                consolidate("Rgaa30.Test.1.2.3-3NMI-04").getValue());
//        assertEquals(TestSolution.NEED_MORE_INFO,
//                consolidate("Rgaa30.Test.1.2.3-3NMI-05").getValue());
//        assertEquals(TestSolution.NEED_MORE_INFO,
//                consolidate("Rgaa30.Test.1.2.3-3NMI-06").getValue());
//        assertEquals(TestSolution.NOT_APPLICABLE,
//                consolidate("Rgaa30.Test.1.2.3-4NA-01").getValue());
//        assertEquals(TestSolution.NOT_APPLICABLE,
//                consolidate("Rgaa30.Test.1.2.3-4NA-02").getValue());
//        assertEquals(TestSolution.NOT_APPLICABLE,
//                consolidate("Rgaa30.Test.1.2.3-4NA-03").getValue());
//        assertEquals(TestSolution.NOT_APPLICABLE,
//                consolidate("Rgaa30.Test.1.2.3-4NA-04").getValue());
//        assertEquals(TestSolution.NOT_APPLICABLE,
//                consolidate("Rgaa30.Test.1.2.3-4NA-05").getValue());
    }

}