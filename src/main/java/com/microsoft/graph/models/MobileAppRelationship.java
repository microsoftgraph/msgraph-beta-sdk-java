package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MobileAppRelationship extends Entity implements Parsable {
    /** The target mobile app's display name.  */
    private String _targetDisplayName;
    /** The target mobile app's display version.  */
    private String _targetDisplayVersion;
    /** The target mobile app's app id.  */
    private String _targetId;
    /** The target mobile app's publisher.  */
    private String _targetPublisher;
    /** The type of relationship indicating whether the target is a parent or child. Possible values are: child, parent.  */
    private MobileAppRelationshipType _targetType;
    /**
     * Instantiates a new mobileAppRelationship and sets the default values.
     * @return a void
     */
    public MobileAppRelationship() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mobileAppRelationship
     */
    @javax.annotation.Nonnull
    public static MobileAppRelationship createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppRelationship();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MobileAppRelationship currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("targetDisplayName", (n) -> { currentObject.setTargetDisplayName(n.getStringValue()); });
            this.put("targetDisplayVersion", (n) -> { currentObject.setTargetDisplayVersion(n.getStringValue()); });
            this.put("targetId", (n) -> { currentObject.setTargetId(n.getStringValue()); });
            this.put("targetPublisher", (n) -> { currentObject.setTargetPublisher(n.getStringValue()); });
            this.put("targetType", (n) -> { currentObject.setTargetType(n.getEnumValue(MobileAppRelationshipType.class)); });
        }};
    }
    /**
     * Gets the targetDisplayName property value. The target mobile app's display name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetDisplayName() {
        return this._targetDisplayName;
    }
    /**
     * Gets the targetDisplayVersion property value. The target mobile app's display version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetDisplayVersion() {
        return this._targetDisplayVersion;
    }
    /**
     * Gets the targetId property value. The target mobile app's app id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetId() {
        return this._targetId;
    }
    /**
     * Gets the targetPublisher property value. The target mobile app's publisher.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetPublisher() {
        return this._targetPublisher;
    }
    /**
     * Gets the targetType property value. The type of relationship indicating whether the target is a parent or child. Possible values are: child, parent.
     * @return a mobileAppRelationshipType
     */
    @javax.annotation.Nullable
    public MobileAppRelationshipType getTargetType() {
        return this._targetType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("targetDisplayName", this.getTargetDisplayName());
        writer.writeStringValue("targetDisplayVersion", this.getTargetDisplayVersion());
        writer.writeStringValue("targetId", this.getTargetId());
        writer.writeStringValue("targetPublisher", this.getTargetPublisher());
        writer.writeEnumValue("targetType", this.getTargetType());
    }
    /**
     * Sets the targetDisplayName property value. The target mobile app's display name.
     * @param value Value to set for the targetDisplayName property.
     * @return a void
     */
    public void setTargetDisplayName(@javax.annotation.Nullable final String value) {
        this._targetDisplayName = value;
    }
    /**
     * Sets the targetDisplayVersion property value. The target mobile app's display version.
     * @param value Value to set for the targetDisplayVersion property.
     * @return a void
     */
    public void setTargetDisplayVersion(@javax.annotation.Nullable final String value) {
        this._targetDisplayVersion = value;
    }
    /**
     * Sets the targetId property value. The target mobile app's app id.
     * @param value Value to set for the targetId property.
     * @return a void
     */
    public void setTargetId(@javax.annotation.Nullable final String value) {
        this._targetId = value;
    }
    /**
     * Sets the targetPublisher property value. The target mobile app's publisher.
     * @param value Value to set for the targetPublisher property.
     * @return a void
     */
    public void setTargetPublisher(@javax.annotation.Nullable final String value) {
        this._targetPublisher = value;
    }
    /**
     * Sets the targetType property value. The type of relationship indicating whether the target is a parent or child. Possible values are: child, parent.
     * @param value Value to set for the targetType property.
     * @return a void
     */
    public void setTargetType(@javax.annotation.Nullable final MobileAppRelationshipType value) {
        this._targetType = value;
    }
}
