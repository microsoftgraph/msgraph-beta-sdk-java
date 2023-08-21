package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnitOfMeasure implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The code property
     */
    private String code;
    /**
     * The displayName property
     */
    private String displayName;
    /**
     * The id property
     */
    private UUID id;
    /**
     * The internationalStandardCode property
     */
    private String internationalStandardCode;
    /**
     * The lastModifiedDateTime property
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new unitOfMeasure and sets the default values.
     */
    public UnitOfMeasure() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unitOfMeasure
     */
    @jakarta.annotation.Nonnull
    public static UnitOfMeasure createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnitOfMeasure();
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
     * Gets the code property value. The code property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCode() {
        return this.code;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("code", (n) -> { this.setCode(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("internationalStandardCode", (n) -> { this.setInternationalStandardCode(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The id property
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getId() {
        return this.id;
    }
    /**
     * Gets the internationalStandardCode property value. The internationalStandardCode property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getInternationalStandardCode() {
        return this.internationalStandardCode;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("code", this.getCode());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeUUIDValue("id", this.getId());
        writer.writeStringValue("internationalStandardCode", this.getInternationalStandardCode());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the code property value. The code property
     * @param value Value to set for the code property.
     */
    public void setCode(@jakarta.annotation.Nullable final String value) {
        this.code = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final UUID value) {
        this.id = value;
    }
    /**
     * Sets the internationalStandardCode property value. The internationalStandardCode property
     * @param value Value to set for the internationalStandardCode property.
     */
    public void setInternationalStandardCode(@jakarta.annotation.Nullable final String value) {
        this.internationalStandardCode = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
