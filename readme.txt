下拉选择框
//通过下拉列表中选项的索引选中第二项，即2011年  
    Select selectAge = new Select(dr.findElement(By.id("User_Age")));  
    selectAge.selectByIndex(2);  
      
    //通过下拉列表中的选项的value属性选中"上海"这一项  
    Select selectShen = new Select(dr.findElement(By.id("User_Shen")));  
    selectShen.selectByValue("上海");  
      
    //通过下拉列表中选项的可见文本选 中"浦东"这一项  
    Select selectTown = new Select(dr.findElement(By.id("User_Town")));  
    selectTown.selectByVisibleText("浦东");  
      
    //这里只是想遍历一下下拉列表所有选项，用click进行选中选项  
    Select selectCity = new Select(dr.findElement(By.id("User_City")));  
    for(WebElement e : selectCity.getOptions())  
        e.click();  
        
 前进后退
driver.navigate().forward(); // 前进
driver.navigate().back(); // 后退
driver.navigate().refresh(); // 刷新