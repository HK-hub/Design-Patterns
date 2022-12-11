package com.hk.design.pattern.command.simple.command;

import com.hk.design.pattern.command.simple.group.CodeGroup;
import com.hk.design.pattern.command.simple.group.Group;
import com.hk.design.pattern.command.simple.group.PageGroup;
import com.hk.design.pattern.command.simple.group.RequirementGroup;

/**
 * @author : HK意境
 * @ClassName : Command
 * @date : 2022/12/11 19:59
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public abstract class Command {

    protected Group rg = new RequirementGroup();
    protected Group cg = new CodeGroup();
    protected Group pg = new PageGroup();

    public abstract void execute();


}
