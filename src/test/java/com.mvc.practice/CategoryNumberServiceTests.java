package com.mvc.practice;

import com.mvc.practice.domain.*;
import com.mvc.practice.service.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "file:src/main/webapp/WEB-INF/applicationContext.xml",
        "file:src/main/webapp/WEB-INF/dispatcher-servlet.xml",
        "file:src/main/webapp/WEB-INF/context-mybatis.xml"})
public class CategoryNumberServiceTests {

    @Autowired
    private CategoryOneService categoryOneService;

    @Autowired
    private CategoryTwoService categoryTwoService;

    @Autowired
    private CategoryThreeService categoryThreeService;

    @Autowired
    private CategoryFourService categoryFourService;

    @Autowired
    private CategoryFiveService categoryFiveService;

    @Test
    public void findOneAll(){
        List<CategoryOne> categoryOneList = categoryOneService.findAll();

        System.out.println(categoryOneList);
    }

    @Test
    public void findOne(){
        int id = 1;
        CategoryOne categoryOne = categoryOneService.findOne(id);

        System.out.println(categoryOne);
    }

    @Test
    public void insertOne(){
        CategoryOne categoryOne = new CategoryOne();
        categoryOne.setName("nameInsert");
        categoryOne.setStatus(CategoryStatus.ONE);
        categoryOne.setCreatedAt(new Date());
        categoryOne.setModifiedAt(new Date());

        int result = categoryOneService.insert(categoryOne);

        System.out.println(result);
    }

    @Test
    public void updateOne(){
        CategoryOne lastCategoryOne = lastOne();
        lastCategoryOne.setName("nameUpdate");
        lastCategoryOne.setStatus(CategoryStatus.ONE);
        lastCategoryOne.setCreatedAt(new Date());
        lastCategoryOne.setModifiedAt(new Date());

        int result = categoryOneService.update(lastCategoryOne);

        System.out.println(result);
    }

    @Test
    public void deleteOne(){
        CategoryOne lastCategoryOne = lastOne();

        int result = categoryOneService.delete(lastCategoryOne.getId());

        System.out.println(result);
    }

    @Test
    public void findTwoAll(){
        List<CategoryTwo> categoryTwoList = categoryTwoService.findAll();

        System.out.println(categoryTwoList);
    }

    @Test
    public void findTwo(){
        int id = 1;
        CategoryTwo categoryTwo = categoryTwoService.findOne(id);

        System.out.println(categoryTwo);
    }

    @Test
    public void insertTwo(){
        CategoryOne categoryOne = new CategoryOne();
        categoryOne.setId(1);

        CategoryTwo categoryTwo = new CategoryTwo();
        categoryTwo.setName("nameInsert");
        categoryTwo.setStatus(CategoryStatus.TWO);
        categoryTwo.setCategoryOne(categoryOne);
        categoryTwo.setCreatedAt(new Date());
        categoryTwo.setModifiedAt(new Date());

        int result = categoryTwoService.insert(categoryTwo);

        System.out.println(result);
    }

    @Test
    public void updateTwo(){
        CategoryTwo lastCategoryTwo = lastTwo();
        lastCategoryTwo.setName("nameUpdate");
        lastCategoryTwo.setStatus(CategoryStatus.TWO);
        lastCategoryTwo.setCreatedAt(new Date());
        lastCategoryTwo.setModifiedAt(new Date());

        int result = categoryTwoService.update(lastCategoryTwo);

        System.out.println(result);
    }

    @Test
    public void deleteTwo(){
        CategoryTwo lastCategoryTwo = lastTwo();

        int result = categoryTwoService.delete(lastCategoryTwo.getId());

        System.out.println(result);
    }

    @Test
    public void findThreeAll(){
        List<CategoryThree> categoryThreeList = categoryThreeService.findAll();

        System.out.println(categoryThreeList);
    }

    @Test
    public void findThree(){
        int id = 1;
        CategoryThree categoryThree = categoryThreeService.findOne(id);

        System.out.println(categoryThree);
    }

    @Test
    public void insertThree(){
        CategoryTwo categoryTwo = new CategoryTwo();
        categoryTwo.setId(1);

        CategoryThree categoryThree = new CategoryThree();
        categoryThree.setName("nameInsert");
        categoryThree.setStatus(CategoryStatus.THREE);
        categoryThree.setCategoryTwo(categoryTwo);
        categoryThree.setCreatedAt(new Date());
        categoryThree.setModifiedAt(new Date());

        int result = categoryThreeService.insert(categoryThree);

        System.out.println(result);
    }

    @Test
    public void updateThree(){
        CategoryThree lastCategoryThree = lastThree();
        lastCategoryThree.setName("nameUpdate");
        lastCategoryThree.setStatus(CategoryStatus.THREE);
        lastCategoryThree.setCreatedAt(new Date());
        lastCategoryThree.setModifiedAt(new Date());

        int result = categoryThreeService.update(lastCategoryThree);

        System.out.println(result);
    }

    @Test
    public void deleteThree(){
        CategoryThree lastCategoryThree = lastThree();

        int result = categoryThreeService.delete(lastCategoryThree.getId());

        System.out.println(result);
    }

    @Test
    public void findFourAll(){
        List<CategoryFour> categoryFourList = categoryFourService.findAll();

        System.out.println(categoryFourList);
    }

    @Test
    public void findFour(){
        int id = 1;
        CategoryFour categoryFour = categoryFourService.findOne(id);

        System.out.println(categoryFour);
    }

    @Test
    public void insertFour(){
        CategoryThree categoryThree = new CategoryThree();
        categoryThree.setId(1);

        CategoryFour categoryFour = new CategoryFour();
        categoryFour.setName("nameInsert");
        categoryFour.setStatus(CategoryStatus.FOUR);
        categoryFour.setCategoryThree(categoryThree);
        categoryFour.setCreatedAt(new Date());
        categoryFour.setModifiedAt(new Date());

        int result = categoryFourService.insert(categoryFour);

        System.out.println(result);
    }

    @Test
    public void updateFour(){
        CategoryFour lastCategoryFour = lastFour();
        lastCategoryFour.setName("nameUpdate");
        lastCategoryFour.setStatus(CategoryStatus.FOUR);
        lastCategoryFour.setCreatedAt(new Date());
        lastCategoryFour.setModifiedAt(new Date());

        int result = categoryFourService.update(lastCategoryFour);

        System.out.println(result);
    }

    @Test
    public void deleteFour(){
        CategoryFour lastCategoryFour = lastFour();

        int result = categoryFourService.delete(lastCategoryFour.getId());

        System.out.println(result);
    }

    @Test
    public void findFiveAll(){
        List<CategoryFive> categoryFiveList = categoryFiveService.findAll();

        System.out.println(categoryFiveList);
    }

    @Test
    public void findFive(){
        int id = 1;
        CategoryFive categoryFive = categoryFiveService.findOne(id);

        System.out.println(categoryFive);
    }

    @Test
    public void insertFive(){
        CategoryFour categoryFour = new CategoryFour();
        categoryFour.setId(1);

        CategoryFive categoryFive = new CategoryFive();
        categoryFive.setName("nameInsert");
        categoryFive.setStatus(CategoryStatus.FIVE);
        categoryFive.setCategoryFour(categoryFour);
        categoryFive.setCreatedAt(new Date());
        categoryFive.setModifiedAt(new Date());

        int result = categoryFiveService.insert(categoryFive);

        System.out.println(result);
    }

    @Test
    public void updateFive(){
        CategoryFive lastCategoryFive = lastFive();
        lastCategoryFive.setName("nameUpdate");
        lastCategoryFive.setStatus(CategoryStatus.FIVE);
        lastCategoryFive.setCreatedAt(new Date());
        lastCategoryFive.setModifiedAt(new Date());

        int result = categoryFiveService.update(lastCategoryFive);

        System.out.println(result);
    }

    @Test
    public void deleteFive(){
        CategoryFive lastCategoryFive = lastFive();

        int result = categoryFiveService.delete(lastCategoryFive.getId());

        System.out.println(result);
    }

    private CategoryOne lastOne() {
        List<CategoryOne> categoryList = categoryOneService.findAll();
        CategoryOne lastCategory = categoryList.get(categoryList.size()-1);
        return lastCategory;
    }

    private CategoryTwo lastTwo() {
        List<CategoryTwo> categoryList = categoryTwoService.findAll();
        CategoryTwo lastCategory = categoryList.get(categoryList.size()-1);
        return lastCategory;
    }

    private CategoryThree lastThree() {
        List<CategoryThree> categoryList = categoryThreeService.findAll();
        CategoryThree lastCategory = categoryList.get(categoryList.size()-1);
        return lastCategory;
    }

    private CategoryFour lastFour() {
        List<CategoryFour> categoryList = categoryFourService.findAll();
        CategoryFour lastCategory = categoryList.get(categoryList.size()-1);
        return lastCategory;
    }

    private CategoryFive lastFive() {
        List<CategoryFive> categoryList = categoryFiveService.findAll();
        CategoryFive lastCategory = categoryList.get(categoryList.size()-1);
        return lastCategory;
    }

}