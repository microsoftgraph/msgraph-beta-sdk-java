package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Casts the previous resource to group. */
public class PersonAnnotation extends ItemFacet implements Parsable {
    /** Contains the detail of the note itself. */
    private ItemBody _detail;
    /** Contains a friendly name for the note. */
    private String _displayName;
    /** The thumbnailUrl property */
    private String _thumbnailUrl;
    /**
     * Instantiates a new personAnnotation and sets the default values.
     * @return a void
     */
    public PersonAnnotation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a personAnnotation
     */
    @javax.annotation.Nonnull
    public static PersonAnnotation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PersonAnnotation();
    }
    /**
     * Gets the detail property value. Contains the detail of the note itself.
     * @return a itemBody
     */
    @javax.annotation.Nullable
    public ItemBody getDetail() {
        return this._detail;
    }
    /**
     * Gets the displayName property value. Contains a friendly name for the note.
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
        final PersonAnnotation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("detail", (n) -> { currentObject.setDetail(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("thumbnailUrl", (n) -> { currentObject.setThumbnailUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the thumbnailUrl property value. The thumbnailUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getThumbnailUrl() {
        return this._thumbnailUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("detail", this.getDetail());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("thumbnailUrl", this.getThumbnailUrl());
    }
    /**
     * Sets the detail property value. Contains the detail of the note itself.
     * @param value Value to set for the detail property.
     * @return a void
     */
    public void setDetail(@javax.annotation.Nullable final ItemBody value) {
        this._detail = value;
    }
    /**
     * Sets the displayName property value. Contains a friendly name for the note.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the thumbnailUrl property value. The thumbnailUrl property
     * @param value Value to set for the thumbnailUrl property.
     * @return a void
     */
    public void setThumbnailUrl(@javax.annotation.Nullable final String value) {
        this._thumbnailUrl = value;
    }
}
