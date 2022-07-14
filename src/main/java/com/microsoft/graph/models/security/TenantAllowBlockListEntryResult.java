package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TenantAllowBlockListEntryResult implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The entryType property */
    private TenantAllowBlockListEntryType _entryType;
    /** The expirationDateTime property */
    private OffsetDateTime _expirationDateTime;
    /** The identity property */
    private String _identity;
    /** The status property */
    private LongRunningOperationStatus _status;
    /** The value property */
    private String _value;
    /**
     * Instantiates a new tenantAllowBlockListEntryResult and sets the default values.
     * @return a void
     */
    public TenantAllowBlockListEntryResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a tenantAllowBlockListEntryResult
     */
    @javax.annotation.Nonnull
    public static TenantAllowBlockListEntryResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantAllowBlockListEntryResult();
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
     * Gets the entryType property value. The entryType property
     * @return a tenantAllowBlockListEntryType
     */
    @javax.annotation.Nullable
    public TenantAllowBlockListEntryType getEntryType() {
        return this._entryType;
    }
    /**
     * Gets the expirationDateTime property value. The expirationDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this._expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TenantAllowBlockListEntryResult currentObject = this;
        return new HashMap<>(5) {{
            this.put("entryType", (n) -> { currentObject.setEntryType(n.getEnumValue(TenantAllowBlockListEntryType.class)); });
            this.put("expirationDateTime", (n) -> { currentObject.setExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("identity", (n) -> { currentObject.setIdentity(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(LongRunningOperationStatus.class)); });
            this.put("value", (n) -> { currentObject.setValue(n.getStringValue()); });
        }};
    }
    /**
     * Gets the identity property value. The identity property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentity() {
        return this._identity;
    }
    /**
     * Gets the status property value. The status property
     * @return a longRunningOperationStatus
     */
    @javax.annotation.Nullable
    public LongRunningOperationStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the value property value. The value property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getValue() {
        return this._value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("entryType", this.getEntryType());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeStringValue("identity", this.getIdentity());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("value", this.getValue());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the entryType property value. The entryType property
     * @param value Value to set for the entryType property.
     * @return a void
     */
    public void setEntryType(@javax.annotation.Nullable final TenantAllowBlockListEntryType value) {
        this._entryType = value;
    }
    /**
     * Sets the expirationDateTime property value. The expirationDateTime property
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTime = value;
    }
    /**
     * Sets the identity property value. The identity property
     * @param value Value to set for the identity property.
     * @return a void
     */
    public void setIdentity(@javax.annotation.Nullable final String value) {
        this._identity = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final LongRunningOperationStatus value) {
        this._status = value;
    }
    /**
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     * @return a void
     */
    public void setValue(@javax.annotation.Nullable final String value) {
        this._value = value;
    }
}
