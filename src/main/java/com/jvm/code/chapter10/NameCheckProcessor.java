package com.jvm.code.chapter10;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import java.util.Set;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/4/16
 */
// 可以用"*"表示支持所有Annotations
@SupportedAnnotationTypes("*")
// 只支持JDK 1.8的Java代码
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class NameCheckProcessor extends AbstractProcessor {
    private NameChecker nameChecker;

    /**
     * 初始化名称检查插件
     */
    @Override
    public void init(ProcessingEnvironment processingEnv){
        super.init(processingEnv);
        nameChecker = new NameChecker(processingEnv);
    }

    /**
     * 对输入的语法树的各个节点进行进行名称检查
     */
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        if(!roundEnv.processingOver()){
            for(Element element : roundEnv.getRootElements()){
                nameChecker.checkNames(element);
            }
        }
        return false;
    }
}