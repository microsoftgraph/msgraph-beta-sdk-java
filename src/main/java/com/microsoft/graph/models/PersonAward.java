package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PersonAward extends ItemFacet implements Parsable {
    /** Descpription of the award or honor. */
    private String _description;
    /** Name of the award or honor. */
    private String _displayName;
    /** The date that the award or honor was granted. */
    private LocalDate _issuedDate;
    /** Authority which granted the award or honor. */
    private String _issuingAuthority;
    /** URL referencing a thumbnail of the award or honor. */
    private String _thumbnailUrl;
    /** URL referencing the award or honor. */
    private String _webUrl;
    /**
     * Instantiates a new personAward and sets the default values.
     * @return a void
     */
    public PersonAward() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a personAward
     */
    @javax.annotation.Nonnull
    public static PersonAward createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PersonAward();
    }
    /**
     * Gets the description property value. Descpription of the award or honor.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. Name of the award or honor.
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
        final PersonAward currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("issuedDate", (n) -> { currentObject.setIssuedDate(n.getLocalDateValue()); });
            this.put("issuingAuthority", (n) -> { currentObject.setIssuingAuthority(n.getStringValue()); });
            this.put("thumbnailUrl", (n) -> { currentObject.setThumbnailUrl(n.getStringValue()); });
            this.put("webUrl", (n) -> { currentObject.setWebUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the issuedDate property value. The date that the award or honor was granted.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getIssuedDate() {
        return this._issuedDate;
    }
    /**
     * Gets the issuingAuthority property value. Authority which granted the award or honor.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIssuingAuthority() {
        return this._issuingAuthority;
    }
    /**
     * Gets the thumbnailUrl property value. URL referencing a thumbnail of the award or honor.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getThumbnailUrl() {
        return this._thumbnailUrl;
    }
    /**
     * Gets the webUrl property value. URL referencing the award or honor.
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
        writer.writeLocalDateValue("issuedDate", this.getIssuedDate());
        writer.writeStringValue("issuingAuthority", this.getIssuingAuthority());
        writer.writeStringValue("thumbnailUrl", this.getThumbnailUrl());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the description property value. Descpription of the award or honor.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Name of the award or honor.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the issuedDate property value. The date that the award or honor was granted.
     * @param value Value to set for the issuedDate property.
     * @return a void
     */
    public void setIssuedDate(@javax.annotation.Nullable final LocalDate value) {
        this._issuedDate = value;
    }
    /**
     * Sets the issuingAuthority property value. Authority which granted the award or honor.
     * @param value Value to set for the issuingAuthority property.
     * @return a void
     */
    public void setIssuingAuthority(@javax.annotation.Nullable final String value) {
        this._issuingAuthority = value;
    }
    /**
     * Sets the thumbnailUrl property value. URL referencing a thumbnail of the award or honor.
     * @param value Value to set for the thumbnailUrl property.
     * @return a void
     */
    public void setThumbnailUrl(@javax.annotation.Nullable final String value) {
        this._thumbnailUrl = value;
    }
    /**
     * Sets the webUrl property value. URL referencing the award or honor.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this._webUrl = value;
    }
}
