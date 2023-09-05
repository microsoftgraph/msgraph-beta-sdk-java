package com.microsoft.graph.devicemanagement.virtualendpoint.provisioningpolicies.applyconfig;

import com.microsoft.graph.models.CloudPcPolicySettingType;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApplyConfigPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The cloudPcIds property
     */
    private java.util.List<String> cloudPcIds;
    /**
     * The policySettings property
     */
    private EnumSet<CloudPcPolicySettingType> policySettings;
    /**
     * Instantiates a new applyConfigPostRequestBody and sets the default values.
     */
    public ApplyConfigPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a applyConfigPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ApplyConfigPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplyConfigPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the cloudPcIds property value. The cloudPcIds property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCloudPcIds() {
        return this.cloudPcIds;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("cloudPcIds", (n) -> { this.setCloudPcIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("policySettings", (n) -> { this.setPolicySettings(n.getEnumSetValue(CloudPcPolicySettingType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the policySettings property value. The policySettings property
     * @return a cloudPcPolicySettingType
     */
    @jakarta.annotation.Nullable
    public CloudPcPolicySettingType getPolicySettings() {
        return this.policySettings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("cloudPcIds", this.getCloudPcIds());
        writer.writeEnumSetValue("policySettings", this.getPolicySettings());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the cloudPcIds property value. The cloudPcIds property
     * @param value Value to set for the cloudPcIds property.
     */
    public void setCloudPcIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.cloudPcIds = value;
    }
    /**
     * Sets the policySettings property value. The policySettings property
     * @param value Value to set for the policySettings property.
     */
    public void setPolicySettings(@jakarta.annotation.Nullable final CloudPcPolicySettingType value) {
        this.policySettings = value;
    }
}
