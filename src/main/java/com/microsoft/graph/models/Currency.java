package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Currency extends Entity implements Parsable {
    /** The amountDecimalPlaces property */
    private String amountDecimalPlaces;
    /** The amountRoundingPrecision property */
    private BigDecimal amountRoundingPrecision;
    /** The code property */
    private String code;
    /** The displayName property */
    private String displayName;
    /** The lastModifiedDateTime property */
    private OffsetDateTime lastModifiedDateTime;
    /** The symbol property */
    private String symbol;
    /**
     * Instantiates a new Currency and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Currency() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Currency
     */
    @javax.annotation.Nonnull
    public static Currency createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Currency();
    }
    /**
     * Gets the amountDecimalPlaces property value. The amountDecimalPlaces property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAmountDecimalPlaces() {
        return this.amountDecimalPlaces;
    }
    /**
     * Gets the amountRoundingPrecision property value. The amountRoundingPrecision property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getAmountRoundingPrecision() {
        return this.amountRoundingPrecision;
    }
    /**
     * Gets the code property value. The code property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCode() {
        return this.code;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("amountDecimalPlaces", (n) -> { this.setAmountDecimalPlaces(n.getStringValue()); });
        deserializerMap.put("amountRoundingPrecision", (n) -> { this.setAmountRoundingPrecision(n.getBigDecimalValue()); });
        deserializerMap.put("code", (n) -> { this.setCode(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("symbol", (n) -> { this.setSymbol(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the symbol property value. The symbol property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSymbol() {
        return this.symbol;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("amountDecimalPlaces", this.getAmountDecimalPlaces());
        writer.writeBigDecimalValue("amountRoundingPrecision", this.getAmountRoundingPrecision());
        writer.writeStringValue("code", this.getCode());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("symbol", this.getSymbol());
    }
    /**
     * Sets the amountDecimalPlaces property value. The amountDecimalPlaces property
     * @param value Value to set for the amountDecimalPlaces property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAmountDecimalPlaces(@javax.annotation.Nullable final String value) {
        this.amountDecimalPlaces = value;
    }
    /**
     * Sets the amountRoundingPrecision property value. The amountRoundingPrecision property
     * @param value Value to set for the amountRoundingPrecision property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAmountRoundingPrecision(@javax.annotation.Nullable final BigDecimal value) {
        this.amountRoundingPrecision = value;
    }
    /**
     * Sets the code property value. The code property
     * @param value Value to set for the code property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCode(@javax.annotation.Nullable final String value) {
        this.code = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the symbol property value. The symbol property
     * @param value Value to set for the symbol property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSymbol(@javax.annotation.Nullable final String value) {
        this.symbol = value;
    }
}
