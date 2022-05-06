package microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
public class DeploymentAudience extends Entity implements Parsable {
    /** Specifies the assets to exclude from the audience.  */
    private java.util.List<UpdatableAsset> _exclusions;
    /** Specifies the assets to include in the audience.  */
    private java.util.List<UpdatableAsset> _members;
    /**
     * Instantiates a new deploymentAudience and sets the default values.
     * @return a void
     */
    public DeploymentAudience() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deploymentAudience
     */
    @javax.annotation.Nonnull
    public static DeploymentAudience createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeploymentAudience();
    }
    /**
     * Gets the exclusions property value. Specifies the assets to exclude from the audience.
     * @return a updatableAsset
     */
    @javax.annotation.Nullable
    public java.util.List<UpdatableAsset> getExclusions() {
        return this._exclusions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeploymentAudience currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("exclusions", (n) -> { currentObject.setExclusions(n.getCollectionOfObjectValues(UpdatableAsset::createFromDiscriminatorValue)); });
            this.put("members", (n) -> { currentObject.setMembers(n.getCollectionOfObjectValues(UpdatableAsset::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the members property value. Specifies the assets to include in the audience.
     * @return a updatableAsset
     */
    @javax.annotation.Nullable
    public java.util.List<UpdatableAsset> getMembers() {
        return this._members;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("exclusions", this.getExclusions());
        writer.writeCollectionOfObjectValues("members", this.getMembers());
    }
    /**
     * Sets the exclusions property value. Specifies the assets to exclude from the audience.
     * @param value Value to set for the exclusions property.
     * @return a void
     */
    public void setExclusions(@javax.annotation.Nullable final java.util.List<UpdatableAsset> value) {
        this._exclusions = value;
    }
    /**
     * Sets the members property value. Specifies the assets to include in the audience.
     * @param value Value to set for the members property.
     * @return a void
     */
    public void setMembers(@javax.annotation.Nullable final java.util.List<UpdatableAsset> value) {
        this._members = value;
    }
}
