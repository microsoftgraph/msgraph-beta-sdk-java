package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ResponsibleSensitiveType implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The description property */
    private String _description;
    /** The id property */
    private String _id;
    /** The name property */
    private String _name;
    /** The OdataType property */
    private String _odataType;
    /** The publisherName property */
    private String _publisherName;
    /** The rulePackageId property */
    private String _rulePackageId;
    /** The rulePackageType property */
    private String _rulePackageType;
    /**
     * Instantiates a new responsibleSensitiveType and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ResponsibleSensitiveType() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.responsibleSensitiveType");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a responsibleSensitiveType
     */
    @javax.annotation.Nonnull
    public static ResponsibleSensitiveType createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResponsibleSensitiveType();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ResponsibleSensitiveType currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(7) {{
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("id", (n) -> { currentObject.setId(n.getStringValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("publisherName", (n) -> { currentObject.setPublisherName(n.getStringValue()); });
            this.put("rulePackageId", (n) -> { currentObject.setRulePackageId(n.getStringValue()); });
            this.put("rulePackageType", (n) -> { currentObject.setRulePackageType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the id property value. The id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the publisherName property value. The publisherName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublisherName() {
        return this._publisherName;
    }
    /**
     * Gets the rulePackageId property value. The rulePackageId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRulePackageId() {
        return this._rulePackageId;
    }
    /**
     * Gets the rulePackageType property value. The rulePackageType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRulePackageType() {
        return this._rulePackageType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the publisherName property value. The publisherName property
     * @param value Value to set for the publisherName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublisherName(@javax.annotation.Nullable final String value) {
        this._publisherName = value;
    }
    /**
     * Sets the rulePackageId property value. The rulePackageId property
     * @param value Value to set for the rulePackageId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRulePackageId(@javax.annotation.Nullable final String value) {
        this._rulePackageId = value;
    }
    /**
     * Sets the rulePackageType property value. The rulePackageType property
     * @param value Value to set for the rulePackageType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRulePackageType(@javax.annotation.Nullable final String value) {
        this._rulePackageType = value;
    }
}
