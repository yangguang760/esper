/*
 ***************************************************************************************
 *  Copyright (C) 2006 EsperTech, Inc. All rights reserved.                            *
 *  http://www.espertech.com/esper                                                     *
 *  http://www.espertech.com                                                           *
 *  ---------------------------------------------------------------------------------- *
 *  The software in this package is published under the terms of the GPL license       *
 *  a copy of which has been included with this distribution in the license.txt file.  *
 ***************************************************************************************
 */
package com.espertech.esper.supportregression.client;

import com.espertech.esper.client.hook.*;
import com.espertech.esper.epl.agg.aggregator.AggregationMethod;
import com.espertech.esper.epl.agg.service.common.AggregationValidationContext;

import java.io.Serializable;

public class MyConcatNoCodegenAggFunctionFactory implements AggregationFunctionFactory, Serializable {
    @Override
    public void validate(AggregationValidationContext validationContext) {
        // No need to check the expression node type
    }

    public Class getValueType() {
        return String.class;
    }


    public void setFunctionName(String functionName) {
        // don't care
    }

    public AggregationMethod newAggregator() {
        return new MyConcatTwoAggMethod();
    }

    public AggregationFunctionFactoryCodegenType getCodegenType() {
        return AggregationFunctionFactoryCodegenType.CODEGEN_NONE;
    }

    public void rowMemberCodegen(AggregationFunctionFactoryCodegenRowMemberContext context) {
        handleShouldNotBeCalled();
    }

    public void applyEnterCodegenManaged(AggregationFunctionFactoryCodegenRowApplyContextManaged context) {
        handleShouldNotBeCalled();
    }

    public void applyLeaveCodegenManaged(AggregationFunctionFactoryCodegenRowApplyContextManaged context) {
        handleShouldNotBeCalled();
    }

    public void applyEnterCodegenUnmanaged(AggregationFunctionFactoryCodegenRowApplyContextUnmanaged context) {
        handleShouldNotBeCalled();
    }

    public void applyLeaveCodegenUnmanaged(AggregationFunctionFactoryCodegenRowApplyContextUnmanaged context) {
        handleShouldNotBeCalled();
    }

    public void clearCodegen(AggregationFunctionFactoryCodegenRowClearContext context) {
        handleShouldNotBeCalled();
    }

    public void getValueCodegen(AggregationFunctionFactoryCodegenRowGetValueContext context) {
        handleShouldNotBeCalled();
    }

    private void handleShouldNotBeCalled() {
        throw new UnsupportedOperationException("Code generation not provided by this class");
    }
}
