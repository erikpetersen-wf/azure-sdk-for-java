/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.compute.v2020_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2020_06_01.VirtualMachineScaleSetRollingUpgrades;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.compute.v2020_06_01.RollingUpgradeStatusInfo;

class VirtualMachineScaleSetRollingUpgradesImpl extends WrapperImpl<VirtualMachineScaleSetRollingUpgradesInner> implements VirtualMachineScaleSetRollingUpgrades {
    private final ComputeManager manager;

    VirtualMachineScaleSetRollingUpgradesImpl(ComputeManager manager) {
        super(manager.inner().virtualMachineScaleSetRollingUpgrades());
        this.manager = manager;
    }

    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public Completable cancelAsync(String resourceGroupName, String vmScaleSetName) {
        VirtualMachineScaleSetRollingUpgradesInner client = this.inner();
        return client.cancelAsync(resourceGroupName, vmScaleSetName).toCompletable();
    }

    @Override
    public Observable<RollingUpgradeStatusInfo> getLatestAsync(String resourceGroupName, String vmScaleSetName) {
        VirtualMachineScaleSetRollingUpgradesInner client = this.inner();
        return client.getLatestAsync(resourceGroupName, vmScaleSetName)
        .map(new Func1<RollingUpgradeStatusInfoInner, RollingUpgradeStatusInfo>() {
            @Override
            public RollingUpgradeStatusInfo call(RollingUpgradeStatusInfoInner inner) {
                return new RollingUpgradeStatusInfoImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable startOSUpgradeAsync(String resourceGroupName, String vmScaleSetName) {
        VirtualMachineScaleSetRollingUpgradesInner client = this.inner();
        return client.startOSUpgradeAsync(resourceGroupName, vmScaleSetName).toCompletable();
    }

    @Override
    public Completable startExtensionUpgradeAsync(String resourceGroupName, String vmScaleSetName) {
        VirtualMachineScaleSetRollingUpgradesInner client = this.inner();
        return client.startExtensionUpgradeAsync(resourceGroupName, vmScaleSetName).toCompletable();
    }

}
