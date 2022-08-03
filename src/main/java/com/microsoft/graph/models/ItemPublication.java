package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ItemPublication extends ItemFacet implements Parsable {
    /** Description of the publication. */
    private String _description;
    /** Title of the publication. */
    private String _displayName;
    /** The date that the publication was published. */
    private LocalDate _publishedDate;
    /** Publication or publisher for the publication. */
    private String _publisher;
    /** URL referencing a thumbnail of the publication. */
    private String _thumbnailUrl;
    /** URL referencing the publication. */
    private String _webUrl;
    /**
     * Instantiates a new ItemPublication and sets the default values.
     * @return a void
     */
    public ItemPublication() {
        super();
        this.setOdataType("#microsoft.graph.itemPublication");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ItemPublication
     */
    @javax.annotation.Nonnull
    public static ItemPublication createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemPublication();
    }
    /**
     * Gets the description property value. Description of the publication.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. Title of the publication.
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
        final ItemPublication currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("publishedDate", (n) -> { currentObject.setPublishedDate(n.getLocalDateValue()); });
            this.put("publisher", (n) -> { currentObject.setPublisher(n.getStringValue()); });
            this.put("thumbnailUrl", (n) -> { currentObject.setThumbnailUrl(n.getStringValue()); });
            this.put("webUrl", (n) -> { currentObject.setWebUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the publishedDate property value. The date that the publication was published.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getPublishedDate() {
        return this._publishedDate;
    }
    /**
     * Gets the publisher property value. Publication or publisher for the publication.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublisher() {
        return this._publisher;
    }
    /**
     * Gets the thumbnailUrl property value. URL referencing a thumbnail of the publication.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getThumbnailUrl() {
        return this._thumbnailUrl;
    }
    /**
     * Gets the webUrl property value. URL referencing the publication.
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
        writer.writeLocalDateValue("publishedDate", this.getPublishedDate());
        writer.writeStringValue("publisher", this.getPublisher());
        writer.writeStringValue("thumbnailUrl", this.getThumbnailUrl());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the description property value. Description of the publication.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Title of the publication.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the publishedDate property value. The date that the publication was published.
     * @param value Value to set for the publishedDate property.
     * @return a void
     */
    public void setPublishedDate(@javax.annotation.Nullable final LocalDate value) {
        this._publishedDate = value;
    }
    /**
     * Sets the publisher property value. Publication or publisher for the publication.
     * @param value Value to set for the publisher property.
     * @return a void
     */
    public void setPublisher(@javax.annotation.Nullable final String value) {
        this._publisher = value;
    }
    /**
     * Sets the thumbnailUrl property value. URL referencing a thumbnail of the publication.
     * @param value Value to set for the thumbnailUrl property.
     * @return a void
     */
    public void setThumbnailUrl(@javax.annotation.Nullable final String value) {
        this._thumbnailUrl = value;
    }
    /**
     * Sets the webUrl property value. URL referencing the publication.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this._webUrl = value;
    }
}
