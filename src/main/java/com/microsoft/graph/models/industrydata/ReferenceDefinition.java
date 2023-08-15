package com.microsoft.graph.models.industrydata;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ReferenceDefinition extends Entity implements Parsable {
    /**
     * The code value for the definition that must be unique within the referenceType.
     */
    private String code;
    /**
     * The date and time when the definition was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Indicates whether the definition has been disabled.
     */
    private Boolean isDisabled;
    /**
     * The date and time when the definition was most recently changed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The categorical type for a collection of enumerated values.
     */
    private String referenceType;
    /**
     * The ordering index to present the definitions within a type consistently in user interfaces.
     */
    private Integer sortIndex;
    /**
     * The standards body or organization source which defined the code.
     */
    private String source;
    /**
     * Instantiates a new referenceDefinition and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ReferenceDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a referenceDefinition
     */
    @jakarta.annotation.Nonnull
    public static ReferenceDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReferenceDefinition();
    }
    /**
     * Gets the code property value. The code value for the definition that must be unique within the referenceType.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCode() {
        return this.code;
    }
    /**
     * Gets the createdDateTime property value. The date and time when the definition was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("code", (n) -> { this.setCode(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("isDisabled", (n) -> { this.setIsDisabled(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("referenceType", (n) -> { this.setReferenceType(n.getStringValue()); });
        deserializerMap.put("sortIndex", (n) -> { this.setSortIndex(n.getIntegerValue()); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isDisabled property value. Indicates whether the definition has been disabled.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDisabled() {
        return this.isDisabled;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the definition was most recently changed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the referenceType property value. The categorical type for a collection of enumerated values.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getReferenceType() {
        return this.referenceType;
    }
    /**
     * Gets the sortIndex property value. The ordering index to present the definitions within a type consistently in user interfaces.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getSortIndex() {
        return this.sortIndex;
    }
    /**
     * Gets the source property value. The standards body or organization source which defined the code.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSource() {
        return this.source;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("code", this.getCode());
        writer.writeBooleanValue("isDisabled", this.getIsDisabled());
        writer.writeStringValue("referenceType", this.getReferenceType());
        writer.writeIntegerValue("sortIndex", this.getSortIndex());
    }
    /**
     * Sets the code property value. The code value for the definition that must be unique within the referenceType.
     * @param value Value to set for the code property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCode(@jakarta.annotation.Nullable final String value) {
        this.code = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time when the definition was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the isDisabled property value. Indicates whether the definition has been disabled.
     * @param value Value to set for the isDisabled property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isDisabled = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the definition was most recently changed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the referenceType property value. The categorical type for a collection of enumerated values.
     * @param value Value to set for the referenceType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setReferenceType(@jakarta.annotation.Nullable final String value) {
        this.referenceType = value;
    }
    /**
     * Sets the sortIndex property value. The ordering index to present the definitions within a type consistently in user interfaces.
     * @param value Value to set for the sortIndex property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSortIndex(@jakarta.annotation.Nullable final Integer value) {
        this.sortIndex = value;
    }
    /**
     * Sets the source property value. The standards body or organization source which defined the code.
     * @param value Value to set for the source property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSource(@jakarta.annotation.Nullable final String value) {
        this.source = value;
    }
}
