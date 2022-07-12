package microsoft.graph.models.tenantadmin;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
public class Sharepoint extends Entity implements Parsable {
    /** Represents the tenant-level settings for SharePoint and OneDrive. */
    private Settings _settings;
    /**
     * Instantiates a new Sharepoint and sets the default values.
     * @return a void
     */
    public Sharepoint() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Sharepoint
     */
    @javax.annotation.Nonnull
    public static Sharepoint createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Sharepoint();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Sharepoint currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("settings", (n) -> { currentObject.setSettings(n.getObjectValue(Settings::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the settings property value. Represents the tenant-level settings for SharePoint and OneDrive.
     * @return a settings
     */
    @javax.annotation.Nullable
    public Settings getSettings() {
        return this._settings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("settings", this.getSettings());
    }
    /**
     * Sets the settings property value. Represents the tenant-level settings for SharePoint and OneDrive.
     * @param value Value to set for the settings property.
     * @return a void
     */
    public void setSettings(@javax.annotation.Nullable final Settings value) {
        this._settings = value;
    }
}
