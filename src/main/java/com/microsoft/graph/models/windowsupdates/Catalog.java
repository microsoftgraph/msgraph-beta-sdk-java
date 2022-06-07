package microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
/** Provides operations to manage the admin singleton. */
public class Catalog extends Entity implements Parsable {
    /** Lists the content that you can approve for deployment. Read-only. */
    private java.util.List<CatalogEntry> _entries;
    /**
     * Instantiates a new catalog and sets the default values.
     * @return a void
     */
    public Catalog() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a catalog
     */
    @javax.annotation.Nonnull
    public static Catalog createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Catalog();
    }
    /**
     * Gets the entries property value. Lists the content that you can approve for deployment. Read-only.
     * @return a catalogEntry
     */
    @javax.annotation.Nullable
    public java.util.List<CatalogEntry> getEntries() {
        return this._entries;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Catalog currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("entries", (n) -> { currentObject.setEntries(n.getCollectionOfObjectValues(CatalogEntry::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("entries", this.getEntries());
    }
    /**
     * Sets the entries property value. Lists the content that you can approve for deployment. Read-only.
     * @param value Value to set for the entries property.
     * @return a void
     */
    public void setEntries(@javax.annotation.Nullable final java.util.List<CatalogEntry> value) {
        this._entries = value;
    }
}
