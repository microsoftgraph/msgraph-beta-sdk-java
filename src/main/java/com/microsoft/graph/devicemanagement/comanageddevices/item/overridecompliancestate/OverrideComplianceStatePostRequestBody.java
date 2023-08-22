package com.microsoft.graph.devicemanagement.comanageddevices.item.overridecompliancestate;

import com.microsoft.graph.models.AdministratorConfiguredDeviceComplianceState;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OverrideComplianceStatePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Administrator configured device compliance state Enum
     */
    private AdministratorConfiguredDeviceComplianceState complianceState;
    /**
     * The remediationUrl property
     */
    private String remediationUrl;
    /**
     * Instantiates a new overrideComplianceStatePostRequestBody and sets the default values.
     */
    public OverrideComplianceStatePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a overrideComplianceStatePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static OverrideComplianceStatePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OverrideComplianceStatePostRequestBody();
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
     * Gets the complianceState property value. Administrator configured device compliance state Enum
     * @return a administratorConfiguredDeviceComplianceState
     */
    @jakarta.annotation.Nullable
    public AdministratorConfiguredDeviceComplianceState getComplianceState() {
        return this.complianceState;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("complianceState", (n) -> { this.setComplianceState(n.getEnumValue(AdministratorConfiguredDeviceComplianceState.class)); });
        deserializerMap.put("remediationUrl", (n) -> { this.setRemediationUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the remediationUrl property value. The remediationUrl property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRemediationUrl() {
        return this.remediationUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("complianceState", this.getComplianceState());
        writer.writeStringValue("remediationUrl", this.getRemediationUrl());
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
     * Sets the complianceState property value. Administrator configured device compliance state Enum
     * @param value Value to set for the complianceState property.
     */
    public void setComplianceState(@jakarta.annotation.Nullable final AdministratorConfiguredDeviceComplianceState value) {
        this.complianceState = value;
    }
    /**
     * Sets the remediationUrl property value. The remediationUrl property
     * @param value Value to set for the remediationUrl property.
     */
    public void setRemediationUrl(@jakarta.annotation.Nullable final String value) {
        this.remediationUrl = value;
    }
}
