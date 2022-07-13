package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** iOS URL bookmark */
public class IosBookmark implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The folder into which the bookmark should be added in Safari */
    private String _bookmarkFolder;
    /** The display name of the bookmark */
    private String _displayName;
    /** URL allowed to access */
    private String _url;
    /**
     * Instantiates a new iosBookmark and sets the default values.
     * @return a void
     */
    public IosBookmark() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosBookmark
     */
    @javax.annotation.Nonnull
    public static IosBookmark createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosBookmark();
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
     * Gets the bookmarkFolder property value. The folder into which the bookmark should be added in Safari
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBookmarkFolder() {
        return this._bookmarkFolder;
    }
    /**
     * Gets the displayName property value. The display name of the bookmark
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
        final IosBookmark currentObject = this;
        return new HashMap<>(3) {{
            this.put("bookmarkFolder", (n) -> { currentObject.setBookmarkFolder(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("url", (n) -> { currentObject.setUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the url property value. URL allowed to access
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUrl() {
        return this._url;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("bookmarkFolder", this.getBookmarkFolder());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("url", this.getUrl());
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
     * Sets the bookmarkFolder property value. The folder into which the bookmark should be added in Safari
     * @param value Value to set for the bookmarkFolder property.
     * @return a void
     */
    public void setBookmarkFolder(@javax.annotation.Nullable final String value) {
        this._bookmarkFolder = value;
    }
    /**
     * Sets the displayName property value. The display name of the bookmark
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the url property value. URL allowed to access
     * @param value Value to set for the url property.
     * @return a void
     */
    public void setUrl(@javax.annotation.Nullable final String value) {
        this._url = value;
    }
}
