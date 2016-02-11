// This is a generated file. Not intended for manual editing.
package com.goide.gotemplate.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.goide.gotemplate.psi.*;

public class GoTemplatePipelineStatementImpl extends GoTemplateStatementImpl implements GoTemplatePipelineStatement {

  public GoTemplatePipelineStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GoTemplateVisitor) ((GoTemplateVisitor)visitor).visitPipelineStatement(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public GoTemplatePipeline getPipeline() {
    return findNotNullChildByClass(GoTemplatePipeline.class);
  }

}