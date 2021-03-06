/**********************************************************************
Copyright (c) 2007 Andy Jefferson and others. All rights reserved.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

Contributors:
    ...
**********************************************************************/
package org.datanucleus.enhancer.methods;

import org.datanucleus.enhancer.ClassEnhancer;
import org.datanucleus.enhancer.asm.Opcodes;

/**
 * Method to generate the method "dnIsTransactional" using ASM.
 */
public class IsTransactional extends IsXXX
{
    public static IsTransactional getInstance(ClassEnhancer enhancer)
    {
        return new IsTransactional(enhancer, enhancer.getNamer().getIsTransactionalMethodName(), 
            Opcodes.ACC_PUBLIC | Opcodes.ACC_FINAL, boolean.class, null, null);
    }

    /**
     * Constructor.
     * @param enhancer ClassEnhancer
     * @param name Name of method
     * @param access Access type
     * @param returnType Return type
     * @param argTypes Argument types
     * @param argNames Argument names
     */
    public IsTransactional(ClassEnhancer enhancer, String name, int access, Object returnType, Object[] argTypes, String[] argNames)
    {
        super(enhancer, name, access, returnType, argTypes, argNames);
    }

    /**
     * Method returning the name of the method on the StateManager that gives the return info.
     * @return Name of the StateManager method (isNew, isPersistent, isDeleted etc)
     */
    protected String getStateManagerIsMethod()
    {
        return "isTransactional";
    }
}