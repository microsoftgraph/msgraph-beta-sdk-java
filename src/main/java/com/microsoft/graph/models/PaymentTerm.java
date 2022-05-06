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
public class PaymentTerm extends Entity implements Parsable {
    /** The calculateDiscountOnCreditMemos property  */
    private Boolean _calculateDiscountOnCreditMemos;
    /** The code property  */
    private String _code;
    /** The discountDateCalculation property  */
    private String _discountDateCalculation;
    /** The discountPercent property  */
    private BigDecimal _discountPercent;
    /** The displayName property  */
    private String _displayName;
    /** The dueDateCalculation property  */
    private String _dueDateCalculation;
    /** The lastModifiedDateTime property  */
    private OffsetDateTime _lastModifiedDateTime;
    /**
     * Instantiates a new paymentTerm and sets the default values.
     * @return a void
     */
    public PaymentTerm() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a paymentTerm
     */
    @javax.annotation.Nonnull
    public static PaymentTerm createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PaymentTerm();
    }
    /**
     * Gets the calculateDiscountOnCreditMemos property value. The calculateDiscountOnCreditMemos property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCalculateDiscountOnCreditMemos() {
        return this._calculateDiscountOnCreditMemos;
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
     * Gets the discountDateCalculation property value. The discountDateCalculation property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDiscountDateCalculation() {
        return this._discountDateCalculation;
    }
    /**
     * Gets the discountPercent property value. The discountPercent property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getDiscountPercent() {
        return this._discountPercent;
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
     * Gets the dueDateCalculation property value. The dueDateCalculation property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDueDateCalculation() {
        return this._dueDateCalculation;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PaymentTerm currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("calculateDiscountOnCreditMemos", (n) -> { currentObject.setCalculateDiscountOnCreditMemos(n.getBooleanValue()); });
            this.put("code", (n) -> { currentObject.setCode(n.getStringValue()); });
            this.put("discountDateCalculation", (n) -> { currentObject.setDiscountDateCalculation(n.getStringValue()); });
            this.put("discountPercent", (n) -> { currentObject.setDiscountPercent(n.getBigDecimalValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("dueDateCalculation", (n) -> { currentObject.setDueDateCalculation(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("calculateDiscountOnCreditMemos", this.getCalculateDiscountOnCreditMemos());
        writer.writeStringValue("code", this.getCode());
        writer.writeStringValue("discountDateCalculation", this.getDiscountDateCalculation());
        writer.writeBigDecimalValue("discountPercent", this.getDiscountPercent());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("dueDateCalculation", this.getDueDateCalculation());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
    }
    /**
     * Sets the calculateDiscountOnCreditMemos property value. The calculateDiscountOnCreditMemos property
     * @param value Value to set for the calculateDiscountOnCreditMemos property.
     * @return a void
     */
    public void setCalculateDiscountOnCreditMemos(@javax.annotation.Nullable final Boolean value) {
        this._calculateDiscountOnCreditMemos = value;
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
     * Sets the discountDateCalculation property value. The discountDateCalculation property
     * @param value Value to set for the discountDateCalculation property.
     * @return a void
     */
    public void setDiscountDateCalculation(@javax.annotation.Nullable final String value) {
        this._discountDateCalculation = value;
    }
    /**
     * Sets the discountPercent property value. The discountPercent property
     * @param value Value to set for the discountPercent property.
     * @return a void
     */
    public void setDiscountPercent(@javax.annotation.Nullable final BigDecimal value) {
        this._discountPercent = value;
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
     * Sets the dueDateCalculation property value. The dueDateCalculation property
     * @param value Value to set for the dueDateCalculation property.
     * @return a void
     */
    public void setDueDateCalculation(@javax.annotation.Nullable final String value) {
        this._dueDateCalculation = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
}
