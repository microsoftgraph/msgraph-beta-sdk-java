package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ItemPatent extends ItemFacet implements Parsable {
    /** Descpription of the patent or filing.  */
    private String _description;
    /** Title of the patent or filing.  */
    private String _displayName;
    /** Indicates the patent is pending.  */
    private Boolean _isPending;
    /** The date that the patent was granted.  */
    private LocalDate _issuedDate;
    /** Authority which granted the patent.  */
    private String _issuingAuthority;
    /** The patent number.  */
    private String _number;
    /** URL referencing the patent or filing.  */
    private String _webUrl;
    /**
     * Instantiates a new itemPatent and sets the default values.
     * @return a void
     */
    public ItemPatent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a itemPatent
     */
    @javax.annotation.Nonnull
    public static ItemPatent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemPatent();
    }
    /**
     * Gets the description property value. Descpription of the patent or filing.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. Title of the patent or filing.
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
        final ItemPatent currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("isPending", (n) -> { currentObject.setIsPending(n.getBooleanValue()); });
            this.put("issuedDate", (n) -> { currentObject.setIssuedDate(n.getLocalDateValue()); });
            this.put("issuingAuthority", (n) -> { currentObject.setIssuingAuthority(n.getStringValue()); });
            this.put("number", (n) -> { currentObject.setNumber(n.getStringValue()); });
            this.put("webUrl", (n) -> { currentObject.setWebUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isPending property value. Indicates the patent is pending.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsPending() {
        return this._isPending;
    }
    /**
     * Gets the issuedDate property value. The date that the patent was granted.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getIssuedDate() {
        return this._issuedDate;
    }
    /**
     * Gets the issuingAuthority property value. Authority which granted the patent.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIssuingAuthority() {
        return this._issuingAuthority;
    }
    /**
     * Gets the number property value. The patent number.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNumber() {
        return this._number;
    }
    /**
     * Gets the webUrl property value. URL referencing the patent or filing.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebUrl() {
        return this._webUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isPending", this.getIsPending());
        writer.writeLocalDateValue("issuedDate", this.getIssuedDate());
        writer.writeStringValue("issuingAuthority", this.getIssuingAuthority());
        writer.writeStringValue("number", this.getNumber());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the description property value. Descpription of the patent or filing.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Title of the patent or filing.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the isPending property value. Indicates the patent is pending.
     * @param value Value to set for the isPending property.
     * @return a void
     */
    public void setIsPending(@javax.annotation.Nullable final Boolean value) {
        this._isPending = value;
    }
    /**
     * Sets the issuedDate property value. The date that the patent was granted.
     * @param value Value to set for the issuedDate property.
     * @return a void
     */
    public void setIssuedDate(@javax.annotation.Nullable final LocalDate value) {
        this._issuedDate = value;
    }
    /**
     * Sets the issuingAuthority property value. Authority which granted the patent.
     * @param value Value to set for the issuingAuthority property.
     * @return a void
     */
    public void setIssuingAuthority(@javax.annotation.Nullable final String value) {
        this._issuingAuthority = value;
    }
    /**
     * Sets the number property value. The patent number.
     * @param value Value to set for the number property.
     * @return a void
     */
    public void setNumber(@javax.annotation.Nullable final String value) {
        this._number = value;
    }
    /**
     * Sets the webUrl property value. URL referencing the patent or filing.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this._webUrl = value;
    }
}
