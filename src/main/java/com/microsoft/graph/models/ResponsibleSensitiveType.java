package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ResponsibleSensitiveType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The description property
     */
    private String description;
    /**
     * The id property
     */
    private String id;
    /**
     * The name property
     */
    private String name;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The publisherName property
     */
    private String publisherName;
    /**
     * The rulePackageId property
     */
    private String rulePackageId;
    /**
     * The rulePackageType property
     */
    private String rulePackageType;
    /**
     * Instantiates a new ResponsibleSensitiveType and sets the default values.
     */
    public ResponsibleSensitiveType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ResponsibleSensitiveType
     */
    @jakarta.annotation.Nonnull
    public static ResponsibleSensitiveType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResponsibleSensitiveType();
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
     * Gets the description property value. The description property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("publisherName", (n) -> { this.setPublisherName(n.getStringValue()); });
        deserializerMap.put("rulePackageId", (n) -> { this.setRulePackageId(n.getStringValue()); });
        deserializerMap.put("rulePackageType", (n) -> { this.setRulePackageType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The id property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the name property value. The name property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
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
     * Gets the publisherName property value. The publisherName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPublisherName() {
        return this.publisherName;
    }
    /**
     * Gets the rulePackageId property value. The rulePackageId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRulePackageId() {
        return this.rulePackageId;
    }
    /**
     * Gets the rulePackageType property value. The rulePackageType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRulePackageType() {
        return this.rulePackageType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("publisherName", this.getPublisherName());
        writer.writeStringValue("rulePackageId", this.getRulePackageId());
        writer.writeStringValue("rulePackageType", this.getRulePackageType());
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
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the publisherName property value. The publisherName property
     * @param value Value to set for the publisherName property.
     */
    public void setPublisherName(@jakarta.annotation.Nullable final String value) {
        this.publisherName = value;
    }
    /**
     * Sets the rulePackageId property value. The rulePackageId property
     * @param value Value to set for the rulePackageId property.
     */
    public void setRulePackageId(@jakarta.annotation.Nullable final String value) {
        this.rulePackageId = value;
    }
    /**
     * Sets the rulePackageType property value. The rulePackageType property
     * @param value Value to set for the rulePackageType property.
     */
    public void setRulePackageType(@jakarta.annotation.Nullable final String value) {
        this.rulePackageType = value;
    }
}
