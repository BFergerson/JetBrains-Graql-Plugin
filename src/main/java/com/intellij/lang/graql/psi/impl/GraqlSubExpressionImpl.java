// This is a generated file. Not intended for manual editing.
package com.intellij.lang.graql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.graql.psi.GraqlTokenTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.graql.psi.*;

public class GraqlSubExpressionImpl extends ASTWrapperPsiElement implements GraqlSubExpression {

  public GraqlSubExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GraqlVisitor visitor) {
    visitor.visitSubExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GraqlVisitor) accept((GraqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GraqlDatatypeExpression getDatatypeExpression() {
    return findChildByClass(GraqlDatatypeExpression.class);
  }

  @Override
  @Nullable
  public GraqlRelationField getRelationField() {
    return findChildByClass(GraqlRelationField.class);
  }

  @Override
  @NotNull
  public List<GraqlSubExpressions> getSubExpressionsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GraqlSubExpressions.class);
  }

  @Override
  @Nullable
  public GraqlVarField getVarField() {
    return findChildByClass(GraqlVarField.class);
  }

  @Override
  @Nullable
  public GraqlIdentifierExpr getIdentifierExpr() {
    return findChildByClass(GraqlIdentifierExpr.class);
  }

  @Override
  @Nullable
  public GraqlThingExpr getThingExpr() {
    return findChildByClass(GraqlThingExpr.class);
  }

}
