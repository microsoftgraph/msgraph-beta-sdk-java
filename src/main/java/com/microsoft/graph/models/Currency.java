package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Currency implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The amountDecimalPlaces property
     */
    private String amountDecimalPlaces;
    /**
     * The amountRoundingPrecision property
     */
    private BigDecimal amountRoundingPrecision;
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
     * The lastModifiedDateTime property
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The symbol property
     */
    private String symbol;
    /**
     * Instantiates a new currency and sets the default values.
     */
    public Currency() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a currency
     */
    @jakarta.annotation.Nonnull
    public static Currency createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Currency();
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
     * Gets the amountDecimalPlaces property value. The amountDecimalPlaces property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAmountDecimalPlaces() {
        return this.amountDecimalPlaces;
    }
    /**
     * Gets the amountRoundingPrecision property value. The amountRoundingPrecision property
     * @return a decimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getAmountRoundingPrecision() {
        return this.amountRoundingPrecision;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("amountDecimalPlaces", (n) -> { this.setAmountDecimalPlaces(n.getStringValue()); });
        deserializerMap.put("amountRoundingPrecision", (n) -> { this.setAmountRoundingPrecision(n.getBigDecimalValue()); });
        deserializerMap.put("code", (n) -> { this.setCode(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("symbol", (n) -> { this.setSymbol(n.getStringValue()); });
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
     * Gets the symbol property value. The symbol property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSymbol() {
        return this.symbol;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("amountDecimalPlaces", this.getAmountDecimalPlaces());
        writer.writeBigDecimalValue("amountRoundingPrecision", this.getAmountRoundingPrecision());
        writer.writeStringValue("code", this.getCode());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeUUIDValue("id", this.getId());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("symbol", this.getSymbol());
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
     * Sets the amountDecimalPlaces property value. The amountDecimalPlaces property
     * @param value Value to set for the amountDecimalPlaces property.
     */
    public void setAmountDecimalPlaces(@jakarta.annotation.Nullable final String value) {
        this.amountDecimalPlaces = value;
    }
    /**
     * Sets the amountRoundingPrecision property value. The amountRoundingPrecision property
     * @param value Value to set for the amountRoundingPrecision property.
     */
    public void setAmountRoundingPrecision(@jakarta.annotation.Nullable final BigDecimal value) {
        this.amountRoundingPrecision = value;
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
    /**
     * Sets the symbol property value. The symbol property
     * @param value Value to set for the symbol property.
     */
    public void setSymbol(@jakarta.annotation.Nullable final String value) {
        this.symbol = value;
    }
}
