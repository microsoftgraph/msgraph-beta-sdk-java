package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReportSuspiciousActivitySettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The includeTarget property
     */
    private IncludeTarget includeTarget;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The state property
     */
    private AdvancedConfigState state;
    /**
     * Specifies the number the user enters on their phone to report the MFA prompt as suspicious.
     */
    private Integer voiceReportingCode;
    /**
     * Instantiates a new ReportSuspiciousActivitySettings and sets the default values.
     */
    public ReportSuspiciousActivitySettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ReportSuspiciousActivitySettings
     */
    @jakarta.annotation.Nonnull
    public static ReportSuspiciousActivitySettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReportSuspiciousActivitySettings();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("includeTarget", (n) -> { this.setIncludeTarget(n.getObjectValue(IncludeTarget::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(AdvancedConfigState.class)); });
        deserializerMap.put("voiceReportingCode", (n) -> { this.setVoiceReportingCode(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the includeTarget property value. The includeTarget property
     * @return a IncludeTarget
     */
    @jakarta.annotation.Nullable
    public IncludeTarget getIncludeTarget() {
        return this.includeTarget;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the state property value. The state property
     * @return a AdvancedConfigState
     */
    @jakarta.annotation.Nullable
    public AdvancedConfigState getState() {
        return this.state;
    }
    /**
     * Gets the voiceReportingCode property value. Specifies the number the user enters on their phone to report the MFA prompt as suspicious.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getVoiceReportingCode() {
        return this.voiceReportingCode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("includeTarget", this.getIncludeTarget());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("state", this.getState());
        writer.writeIntegerValue("voiceReportingCode", this.getVoiceReportingCode());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the includeTarget property value. The includeTarget property
     * @param value Value to set for the includeTarget property.
     */
    public void setIncludeTarget(@jakarta.annotation.Nullable final IncludeTarget value) {
        this.includeTarget = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final AdvancedConfigState value) {
        this.state = value;
    }
    /**
     * Sets the voiceReportingCode property value. Specifies the number the user enters on their phone to report the MFA prompt as suspicious.
     * @param value Value to set for the voiceReportingCode property.
     */
    public void setVoiceReportingCode(@jakarta.annotation.Nullable final Integer value) {
        this.voiceReportingCode = value;
    }
}
