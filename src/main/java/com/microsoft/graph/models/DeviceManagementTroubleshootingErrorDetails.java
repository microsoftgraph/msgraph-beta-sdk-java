package com.microsoft.graph.models;

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
 * Object containing detailed information about the error and its remediation.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementTroubleshootingErrorDetails implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new DeviceManagementTroubleshootingErrorDetails and sets the default values.
     */
    public DeviceManagementTroubleshootingErrorDetails() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementTroubleshootingErrorDetails
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementTroubleshootingErrorDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementTroubleshootingErrorDetails();
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
     * Gets the context property value. Not yet documented
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContext() {
        return this.backingStore.get("context");
    }
    /**
     * Gets the failure property value. Not yet documented
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFailure() {
        return this.backingStore.get("failure");
    }
    /**
     * Gets the failureDetails property value. The detailed description of what went wrong.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFailureDetails() {
        return this.backingStore.get("failureDetails");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("context", (n) -> { this.setContext(n.getStringValue()); });
        deserializerMap.put("failure", (n) -> { this.setFailure(n.getStringValue()); });
        deserializerMap.put("failureDetails", (n) -> { this.setFailureDetails(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("remediation", (n) -> { this.setRemediation(n.getStringValue()); });
        deserializerMap.put("resources", (n) -> { this.setResources(n.getCollectionOfObjectValues(DeviceManagementTroubleshootingErrorResource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the remediation property value. The detailed description of how to remediate this issue.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRemediation() {
        return this.backingStore.get("remediation");
    }
    /**
     * Gets the resources property value. Links to helpful documentation about this failure.
     * @return a java.util.List<DeviceManagementTroubleshootingErrorResource>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementTroubleshootingErrorResource> getResources() {
        return this.backingStore.get("resources");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("context", this.getContext());
        writer.writeStringValue("failure", this.getFailure());
        writer.writeStringValue("failureDetails", this.getFailureDetails());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("remediation", this.getRemediation());
        writer.writeCollectionOfObjectValues("resources", this.getResources());
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
     * Sets the context property value. Not yet documented
     * @param value Value to set for the context property.
     */
    public void setContext(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("context", value);
    }
    /**
     * Sets the failure property value. Not yet documented
     * @param value Value to set for the failure property.
     */
    public void setFailure(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("failure", value);
    }
    /**
     * Sets the failureDetails property value. The detailed description of what went wrong.
     * @param value Value to set for the failureDetails property.
     */
    public void setFailureDetails(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("failureDetails", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the remediation property value. The detailed description of how to remediate this issue.
     * @param value Value to set for the remediation property.
     */
    public void setRemediation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("remediation", value);
    }
    /**
     * Sets the resources property value. Links to helpful documentation about this failure.
     * @param value Value to set for the resources property.
     */
    public void setResources(@jakarta.annotation.Nullable final java.util.List<DeviceManagementTroubleshootingErrorResource> value) {
        this.backingStore.set("resources", value);
    }
}
