package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Policy Details for Encryption Report
 */
public class EncryptionReportPolicyDetails implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Policy Id for Encryption Report
     */
    private String policyId;
    /**
     * Policy Name for Encryption Report
     */
    private String policyName;
    /**
     * Instantiates a new encryptionReportPolicyDetails and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EncryptionReportPolicyDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a encryptionReportPolicyDetails
     */
    @javax.annotation.Nonnull
    public static EncryptionReportPolicyDetails createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EncryptionReportPolicyDetails();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("policyId", (n) -> { this.setPolicyId(n.getStringValue()); });
        deserializerMap.put("policyName", (n) -> { this.setPolicyName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the policyId property value. Policy Id for Encryption Report
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPolicyId() {
        return this.policyId;
    }
    /**
     * Gets the policyName property value. Policy Name for Encryption Report
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPolicyName() {
        return this.policyName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("policyId", this.getPolicyId());
        writer.writeStringValue("policyName", this.getPolicyName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the policyId property value. Policy Id for Encryption Report
     * @param value Value to set for the policyId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicyId(@javax.annotation.Nullable final String value) {
        this.policyId = value;
    }
    /**
     * Sets the policyName property value. Policy Name for Encryption Report
     * @param value Value to set for the policyName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicyName(@javax.annotation.Nullable final String value) {
        this.policyName = value;
    }
}
