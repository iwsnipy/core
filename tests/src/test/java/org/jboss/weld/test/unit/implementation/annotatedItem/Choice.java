package org.jboss.weld.test.unit.implementation.annotatedItem;

abstract class ChoiceParent<T>
{
}


class Choice<T, E> extends ChoiceParent<T>
{
   public Choice<T, E> aMethod()
   {
      return null;
   }
}
