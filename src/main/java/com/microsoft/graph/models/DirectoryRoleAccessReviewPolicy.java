package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DirectoryRoleAccessReviewPolicy extends Entity implements Parsable {
    /** The settings property */
    private AccessReviewScheduleSettings _settings;
    /**
     * Instantiates a new DirectoryRoleAccessReviewPolicy and sets the default values.
     * @return a void
     */
    public DirectoryRoleAccessReviewPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DirectoryRoleAccessReviewPolicy
     */
    @javax.annotation.Nonnull
    public static DirectoryRoleAccessReviewPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DirectoryRoleAccessReviewPolicy();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DirectoryRoleAccessReviewPolicy currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("settings", (n) -> { currentObject.setSettings(n.getObjectValue(AccessReviewScheduleSettings::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the settings property value. The settings property
     * @return a accessReviewScheduleSettings
     */
    @javax.annotation.Nullable
    public AccessReviewScheduleSettings getSettings() {
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
     * Sets the settings property value. The settings property
     * @param value Value to set for the settings property.
     * @return a void
     */
    public void setSettings(@javax.annotation.Nullable final AccessReviewScheduleSettings value) {
        this._settings = value;
    }
}
