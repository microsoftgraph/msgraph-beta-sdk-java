package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ExternalItem extends Entity implements Parsable {
    /** The acl property */
    private java.util.List<Acl> _acl;
    /** The content property */
    private ExternalItemContent _content;
    /** The properties property */
    private Properties _properties;
    /**
     * Instantiates a new ExternalItem and sets the default values.
     * @return a void
     */
    public ExternalItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ExternalItem
     */
    @javax.annotation.Nonnull
    public static ExternalItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExternalItem();
    }
    /**
     * Gets the acl property value. The acl property
     * @return a acl
     */
    @javax.annotation.Nullable
    public java.util.List<Acl> getAcl() {
        return this._acl;
    }
    /**
     * Gets the content property value. The content property
     * @return a externalItemContent
     */
    @javax.annotation.Nullable
    public ExternalItemContent getContent() {
        return this._content;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ExternalItem currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("acl", (n) -> { currentObject.setAcl(n.getCollectionOfObjectValues(Acl::createFromDiscriminatorValue)); });
            this.put("content", (n) -> { currentObject.setContent(n.getObjectValue(ExternalItemContent::createFromDiscriminatorValue)); });
            this.put("properties", (n) -> { currentObject.setProperties(n.getObjectValue(Properties::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the properties property value. The properties property
     * @return a properties
     */
    @javax.annotation.Nullable
    public Properties getProperties() {
        return this._properties;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("acl", this.getAcl());
        writer.writeObjectValue("content", this.getContent());
        writer.writeObjectValue("properties", this.getProperties());
    }
    /**
     * Sets the acl property value. The acl property
     * @param value Value to set for the acl property.
     * @return a void
     */
    public void setAcl(@javax.annotation.Nullable final java.util.List<Acl> value) {
        this._acl = value;
    }
    /**
     * Sets the content property value. The content property
     * @param value Value to set for the content property.
     * @return a void
     */
    public void setContent(@javax.annotation.Nullable final ExternalItemContent value) {
        this._content = value;
    }
    /**
     * Sets the properties property value. The properties property
     * @param value Value to set for the properties property.
     * @return a void
     */
    public void setProperties(@javax.annotation.Nullable final Properties value) {
        this._properties = value;
    }
}
