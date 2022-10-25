package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains the groups of devices that will be targeted to receive the organizational message. If a device is part of the excluded group, then it will not receive the message, regardless of the device being part of an included group */
public class OrganizationalMessageTargeting implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The groups that will not receive the message. If a user from an excluded group is part of an included group, it will not receive the message */
    private java.util.List<String> _excludeIds;
    /** The groups that will be targeted and receive the message */
    private java.util.List<String> _includeIds;
    /** The OdataType property */
    private String _odataType;
    /** Indicates the type of targeting */
    private OrganizationalMessageTargetingType _targetingType;
    /**
     * Instantiates a new organizationalMessageTargeting and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OrganizationalMessageTargeting() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.organizationalMessageTargeting");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a organizationalMessageTargeting
     */
    @javax.annotation.Nonnull
    public static OrganizationalMessageTargeting createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationalMessageTargeting();
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
     * Gets the excludeIds property value. The groups that will not receive the message. If a user from an excluded group is part of an included group, it will not receive the message
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getExcludeIds() {
        return this._excludeIds;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OrganizationalMessageTargeting currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(4) {{
            this.put("excludeIds", (n) -> { currentObject.setExcludeIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("includeIds", (n) -> { currentObject.setIncludeIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("targetingType", (n) -> { currentObject.setTargetingType(n.getEnumValue(OrganizationalMessageTargetingType.class)); });
        }};
    }
    /**
     * Gets the includeIds property value. The groups that will be targeted and receive the message
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getIncludeIds() {
        return this._includeIds;
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
     * Gets the targetingType property value. Indicates the type of targeting
     * @return a organizationalMessageTargetingType
     */
    @javax.annotation.Nullable
    public OrganizationalMessageTargetingType getTargetingType() {
        return this._targetingType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("excludeIds", this.getExcludeIds());
        writer.writeCollectionOfPrimitiveValues("includeIds", this.getIncludeIds());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("targetingType", this.getTargetingType());
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
     * Sets the excludeIds property value. The groups that will not receive the message. If a user from an excluded group is part of an included group, it will not receive the message
     * @param value Value to set for the excludeIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludeIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._excludeIds = value;
    }
    /**
     * Sets the includeIds property value. The groups that will be targeted and receive the message
     * @param value Value to set for the includeIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludeIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._includeIds = value;
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
     * Sets the targetingType property value. Indicates the type of targeting
     * @param value Value to set for the targetingType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetingType(@javax.annotation.Nullable final OrganizationalMessageTargetingType value) {
        this._targetingType = value;
    }
}
