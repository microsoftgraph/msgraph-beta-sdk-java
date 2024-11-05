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
 * The DeviceAndAppManagementAssignedRoleDetail is a complex type in Microsoft Intune used to represent the Role Definitions and Permissions that are assigned to a specific user. This type provides a detailed view of the roles a user holds, along with the associated permissions that determine the specific actions the user can perform within Intune environment.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceAndAppManagementAssignedRoleDetail implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link DeviceAndAppManagementAssignedRoleDetail} and sets the default values.
     */
    public DeviceAndAppManagementAssignedRoleDetail() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceAndAppManagementAssignedRoleDetail}
     */
    @jakarta.annotation.Nonnull
    public static DeviceAndAppManagementAssignedRoleDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceAndAppManagementAssignedRoleDetail();
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
        deserializerMap.put("roleDefinitions", (n) -> { this.setRoleDefinitions(n.getCollectionOfObjectValues(DeviceAndAppManagementAssignedRoleDefinition::createFromDiscriminatorValue)); });
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
     * Gets the permissions property value. The list of permissions assigned to a specific user based on their associated role definitions. Each permission defines the specific actions the user can perform on Intune resources, such as managing devices, applications, or configurations. Some possible values are: Microsoft.Intune/MobileApps/Read, Microsoft.Intune/DeviceConfigurations/Write, Microsoft.Intune/ManagedDevices/Retire, and Microsoft.Intune/DeviceCompliancePolicies/Assign. This Permissions property provides a comprehensive view of the user's effective access rights, ensuring that they can only perform actions relevant to their assigned roles. This property is read-only.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPermissions() {
        return this.backingStore.get("permissions");
    }
    /**
     * Gets the roleDefinitions property value. A collection of RoleDefinitions represents the various administrative roles that define permissions and access levels within Microsoft Intune. Each RoleDefinition outlines a set of permissions that determine the actions an admin or user can perform in the Intune environment. These permissions can include actions like reading or writing to specific resources, managing device configurations, deploying policies, or handling user data. RoleDefinitions are critical for enforcing role-based access control (RBAC), ensuring that administrators can only interact with the features and data relevant to their responsibilities. RoleDefinitions in Intune can either be built-in roles provided by Microsoft or custom roles created by an organization to tailor access based on specific needs. These definitions are referenced when assigning roles to users or groups, effectively controlling the scope of their administrative privileges. The collection of RoleDefinitions is managed through the Intune console or the Graph API, allowing for scalable role management across large environments. This property is read-only.
     * @return a {@link java.util.List<DeviceAndAppManagementAssignedRoleDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceAndAppManagementAssignedRoleDefinition> getRoleDefinitions() {
        return this.backingStore.get("roleDefinitions");
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
     * Sets the permissions property value. The list of permissions assigned to a specific user based on their associated role definitions. Each permission defines the specific actions the user can perform on Intune resources, such as managing devices, applications, or configurations. Some possible values are: Microsoft.Intune/MobileApps/Read, Microsoft.Intune/DeviceConfigurations/Write, Microsoft.Intune/ManagedDevices/Retire, and Microsoft.Intune/DeviceCompliancePolicies/Assign. This Permissions property provides a comprehensive view of the user's effective access rights, ensuring that they can only perform actions relevant to their assigned roles. This property is read-only.
     * @param value Value to set for the permissions property.
     */
    public void setPermissions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("permissions", value);
    }
    /**
     * Sets the roleDefinitions property value. A collection of RoleDefinitions represents the various administrative roles that define permissions and access levels within Microsoft Intune. Each RoleDefinition outlines a set of permissions that determine the actions an admin or user can perform in the Intune environment. These permissions can include actions like reading or writing to specific resources, managing device configurations, deploying policies, or handling user data. RoleDefinitions are critical for enforcing role-based access control (RBAC), ensuring that administrators can only interact with the features and data relevant to their responsibilities. RoleDefinitions in Intune can either be built-in roles provided by Microsoft or custom roles created by an organization to tailor access based on specific needs. These definitions are referenced when assigning roles to users or groups, effectively controlling the scope of their administrative privileges. The collection of RoleDefinitions is managed through the Intune console or the Graph API, allowing for scalable role management across large environments. This property is read-only.
     * @param value Value to set for the roleDefinitions property.
     */
    public void setRoleDefinitions(@jakarta.annotation.Nullable final java.util.List<DeviceAndAppManagementAssignedRoleDefinition> value) {
        this.backingStore.set("roleDefinitions", value);
    }
}
