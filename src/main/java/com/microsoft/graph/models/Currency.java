package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class Currency extends Entity implements Parsable {
    /** The amountDecimalPlaces property */
    private String _amountDecimalPlaces;
    /** The amountRoundingPrecision property */
    private BigDecimal _amountRoundingPrecision;
    /** The code property */
    private String _code;
    /** The displayName property */
    private String _displayName;
    /** The lastModifiedDateTime property */
    private OffsetDateTime _lastModifiedDateTime;
    /** The symbol property */
    private String _symbol;
    /**
     * Instantiates a new currency and sets the default values.
     * @return a void
     */
    public Currency() {
        super();
        this.setOdataType("#microsoft.graph.currency");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a currency
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
        return this._amountDecimalPlaces;
    }
    /**
     * Gets the amountRoundingPrecision property value. The amountRoundingPrecision property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getAmountRoundingPrecision() {
        return this._amountRoundingPrecision;
    }
    /**
     * Gets the code property value. The code property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCode() {
        return this._code;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Currency currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("amountDecimalPlaces", (n) -> { currentObject.setAmountDecimalPlaces(n.getStringValue()); });
            this.put("amountRoundingPrecision", (n) -> { currentObject.setAmountRoundingPrecision(n.getBigDecimalValue()); });
            this.put("code", (n) -> { currentObject.setCode(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("symbol", (n) -> { currentObject.setSymbol(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the symbol property value. The symbol property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSymbol() {
        return this._symbol;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAmountDecimalPlaces(@javax.annotation.Nullable final String value) {
        this._amountDecimalPlaces = value;
    }
    /**
     * Sets the amountRoundingPrecision property value. The amountRoundingPrecision property
     * @param value Value to set for the amountRoundingPrecision property.
     * @return a void
     */
    public void setAmountRoundingPrecision(@javax.annotation.Nullable final BigDecimal value) {
        this._amountRoundingPrecision = value;
    }
    /**
     * Sets the code property value. The code property
     * @param value Value to set for the code property.
     * @return a void
     */
    public void setCode(@javax.annotation.Nullable final String value) {
        this._code = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the symbol property value. The symbol property
     * @param value Value to set for the symbol property.
     * @return a void
     */
    public void setSymbol(@javax.annotation.Nullable final String value) {
        this._symbol = value;
    }
}
