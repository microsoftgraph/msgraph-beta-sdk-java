package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Complex type to represent the role that is assigned to the user. This type contains the ID, the display name, and the permissions of the role.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceAndAppManagementAssignedRoleDefinition implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link DeviceAndAppManagementAssignedRoleDefinition} and sets the default values.
     */
    public DeviceAndAppManagementAssignedRoleDefinition() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceAndAppManagementAssignedRoleDefinition}
     */
    @jakarta.annotation.Nonnull
    public static DeviceAndAppManagementAssignedRoleDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceAndAppManagementAssignedRoleDefinition();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("permissions", (n) -> { this.setPermissions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("roleDefinitionDisplayName", (n) -> { this.setRoleDefinitionDisplayName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the permissions property value. A list of permissions based on its associated role. Each permission defines the specific actions the user can perform on Intune resources, such as managing devices, applications, or configurations. Some possible values are: Microsoft.Intune/MobileApps/Read, Microsoft.Intune/DeviceConfigurations/Write, Microsoft.Intune/ManagedDevices/Retire, and Microsoft.Intune/DeviceCompliancePolicies/Assign. This Permissions property offers a comprehensive view of the user&apos;s effective access rights, ensuring that they can only perform actions relevant to their assigned roles. This property is read-only.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPermissions() {
        return this.backingStore.get("permissions");
    }
    /**
     * Gets the roleDefinitionDisplayName property value. The RoleDefinitionDisplayName property represents the human-readable name of a specific role definition in Microsoft Intune. This property provides a clear and descriptive name that indicates the purpose or scope of the role, helping administrators identify and assign appropriate roles to users or groups.Some example values for RoleDefinitionDisplayName might include: &apos;Helpdesk Operator,&apos; &apos;Application Manager,&apos; or &apos;Policy Administrator.&apos; This display name is primarily used in the Intune console or Graph API to present roles in a user-friendly manner, making it easier for administrators to manage role-based access control (RBAC) efficiently. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRoleDefinitionDisplayName() {
        return this.backingStore.get("roleDefinitionDisplayName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the permissions property value. A list of permissions based on its associated role. Each permission defines the specific actions the user can perform on Intune resources, such as managing devices, applications, or configurations. Some possible values are: Microsoft.Intune/MobileApps/Read, Microsoft.Intune/DeviceConfigurations/Write, Microsoft.Intune/ManagedDevices/Retire, and Microsoft.Intune/DeviceCompliancePolicies/Assign. This Permissions property offers a comprehensive view of the user&apos;s effective access rights, ensuring that they can only perform actions relevant to their assigned roles. This property is read-only.
     * @param value Value to set for the permissions property.
     */
    public void setPermissions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("permissions", value);
    }
    /**
     * Sets the roleDefinitionDisplayName property value. The RoleDefinitionDisplayName property represents the human-readable name of a specific role definition in Microsoft Intune. This property provides a clear and descriptive name that indicates the purpose or scope of the role, helping administrators identify and assign appropriate roles to users or groups.Some example values for RoleDefinitionDisplayName might include: &apos;Helpdesk Operator,&apos; &apos;Application Manager,&apos; or &apos;Policy Administrator.&apos; This display name is primarily used in the Intune console or Graph API to present roles in a user-friendly manner, making it easier for administrators to manage role-based access control (RBAC) efficiently. This property is read-only.
     * @param value Value to set for the roleDefinitionDisplayName property.
     */
    public void setRoleDefinitionDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("roleDefinitionDisplayName", value);
    }
}
