package com.microsoft.graph.deviceappmanagement.ioslobappprovisioningconfigurations.item.assign;

import com.microsoft.graph.models.IosLobAppProvisioningConfigurationAssignment;
import com.microsoft.graph.models.MobileAppProvisioningConfigGroupAssignment;
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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AssignPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new AssignPostRequestBody and sets the default values.
     */
    public AssignPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AssignPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static AssignPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * Gets the appProvisioningConfigurationGroupAssignments property value. The appProvisioningConfigurationGroupAssignments property
     * @return a java.util.List<MobileAppProvisioningConfigGroupAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobileAppProvisioningConfigGroupAssignment> getAppProvisioningConfigurationGroupAssignments() {
        return this.backingStore.get("appProvisioningConfigurationGroupAssignments");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("appProvisioningConfigurationGroupAssignments", (n) -> { this.setAppProvisioningConfigurationGroupAssignments(n.getCollectionOfObjectValues(MobileAppProvisioningConfigGroupAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("iOSLobAppProvisioningConfigAssignments", (n) -> { this.setIOSLobAppProvisioningConfigAssignments(n.getCollectionOfObjectValues(IosLobAppProvisioningConfigurationAssignment::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the iOSLobAppProvisioningConfigAssignments property value. The iOSLobAppProvisioningConfigAssignments property
     * @return a java.util.List<IosLobAppProvisioningConfigurationAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IosLobAppProvisioningConfigurationAssignment> getIOSLobAppProvisioningConfigAssignments() {
        return this.backingStore.get("iOSLobAppProvisioningConfigAssignments");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("appProvisioningConfigurationGroupAssignments", this.getAppProvisioningConfigurationGroupAssignments());
        writer.writeCollectionOfObjectValues("iOSLobAppProvisioningConfigAssignments", this.getIOSLobAppProvisioningConfigAssignments());
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
     * Sets the appProvisioningConfigurationGroupAssignments property value. The appProvisioningConfigurationGroupAssignments property
     * @param value Value to set for the appProvisioningConfigurationGroupAssignments property.
     */
    public void setAppProvisioningConfigurationGroupAssignments(@jakarta.annotation.Nullable final java.util.List<MobileAppProvisioningConfigGroupAssignment> value) {
        this.backingStore.set("appProvisioningConfigurationGroupAssignments", value);
    }
    /**
     * Sets the iOSLobAppProvisioningConfigAssignments property value. The iOSLobAppProvisioningConfigAssignments property
     * @param value Value to set for the iOSLobAppProvisioningConfigAssignments property.
     */
    public void setIOSLobAppProvisioningConfigAssignments(@jakarta.annotation.Nullable final java.util.List<IosLobAppProvisioningConfigurationAssignment> value) {
        this.backingStore.set("iOSLobAppProvisioningConfigAssignments", value);
    }
}
