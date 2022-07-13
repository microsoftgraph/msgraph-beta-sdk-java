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
public class TenantAllowOrBlockListAction implements AdditionalDataHolder, Parsable {
    /** The action property */
    private TenantAllowBlockListAction _action;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The expirationDateTime property */
    private OffsetDateTime _expirationDateTime;
    /** The note property */
    private String _note;
    /** The results property */
    private java.util.List<TenantAllowBlockListEntryResult> _results;
    /**
     * Instantiates a new tenantAllowOrBlockListAction and sets the default values.
     * @return a void
     */
    public TenantAllowOrBlockListAction() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a tenantAllowOrBlockListAction
     */
    @javax.annotation.Nonnull
    public static TenantAllowOrBlockListAction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantAllowOrBlockListAction();
    }
    /**
     * Gets the action property value. The action property
     * @return a tenantAllowBlockListAction
     */
    @javax.annotation.Nullable
    public TenantAllowBlockListAction getAction() {
        return this._action;
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
        final TenantAllowOrBlockListAction currentObject = this;
        return new HashMap<>(4) {{
            this.put("action", (n) -> { currentObject.setAction(n.getEnumValue(TenantAllowBlockListAction.class)); });
            this.put("expirationDateTime", (n) -> { currentObject.setExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("note", (n) -> { currentObject.setNote(n.getStringValue()); });
            this.put("results", (n) -> { currentObject.setResults(n.getCollectionOfObjectValues(TenantAllowBlockListEntryResult::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the note property value. The note property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNote() {
        return this._note;
    }
    /**
     * Gets the results property value. The results property
     * @return a tenantAllowBlockListEntryResult
     */
    @javax.annotation.Nullable
    public java.util.List<TenantAllowBlockListEntryResult> getResults() {
        return this._results;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeStringValue("note", this.getNote());
        writer.writeCollectionOfObjectValues("results", this.getResults());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the action property value. The action property
     * @param value Value to set for the action property.
     * @return a void
     */
    public void setAction(@javax.annotation.Nullable final TenantAllowBlockListAction value) {
        this._action = value;
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
     * Sets the expirationDateTime property value. The expirationDateTime property
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTime = value;
    }
    /**
     * Sets the note property value. The note property
     * @param value Value to set for the note property.
     * @return a void
     */
    public void setNote(@javax.annotation.Nullable final String value) {
        this._note = value;
    }
    /**
     * Sets the results property value. The results property
     * @param value Value to set for the results property.
     * @return a void
     */
    public void setResults(@javax.annotation.Nullable final java.util.List<TenantAllowBlockListEntryResult> value) {
        this._results = value;
    }
}
