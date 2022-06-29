package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MobileAppSupersedence extends MobileAppRelationship implements Parsable {
    /** The total number of apps directly or indirectly superseded by the child app. */
    private Integer _supersededAppCount;
    /** The supersedence relationship type between the parent and child apps. Possible values are: update, replace. */
    private MobileAppSupersedenceType _supersedenceType;
    /** The total number of apps directly or indirectly superseding the parent app. */
    private Integer _supersedingAppCount;
    /**
     * Instantiates a new MobileAppSupersedence and sets the default values.
     * @return a void
     */
    public MobileAppSupersedence() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MobileAppSupersedence
     */
    @javax.annotation.Nonnull
    public static MobileAppSupersedence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppSupersedence();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MobileAppSupersedence currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("supersededAppCount", (n) -> { currentObject.setSupersededAppCount(n.getIntegerValue()); });
            this.put("supersedenceType", (n) -> { currentObject.setSupersedenceType(n.getEnumValue(MobileAppSupersedenceType.class)); });
            this.put("supersedingAppCount", (n) -> { currentObject.setSupersedingAppCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the supersededAppCount property value. The total number of apps directly or indirectly superseded by the child app.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSupersededAppCount() {
        return this._supersededAppCount;
    }
    /**
     * Gets the supersedenceType property value. The supersedence relationship type between the parent and child apps. Possible values are: update, replace.
     * @return a mobileAppSupersedenceType
     */
    @javax.annotation.Nullable
    public MobileAppSupersedenceType getSupersedenceType() {
        return this._supersedenceType;
    }
    /**
     * Gets the supersedingAppCount property value. The total number of apps directly or indirectly superseding the parent app.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSupersedingAppCount() {
        return this._supersedingAppCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("supersededAppCount", this.getSupersededAppCount());
        writer.writeEnumValue("supersedenceType", this.getSupersedenceType());
        writer.writeIntegerValue("supersedingAppCount", this.getSupersedingAppCount());
    }
    /**
     * Sets the supersededAppCount property value. The total number of apps directly or indirectly superseded by the child app.
     * @param value Value to set for the supersededAppCount property.
     * @return a void
     */
    public void setSupersededAppCount(@javax.annotation.Nullable final Integer value) {
        this._supersededAppCount = value;
    }
    /**
     * Sets the supersedenceType property value. The supersedence relationship type between the parent and child apps. Possible values are: update, replace.
     * @param value Value to set for the supersedenceType property.
     * @return a void
     */
    public void setSupersedenceType(@javax.annotation.Nullable final MobileAppSupersedenceType value) {
        this._supersedenceType = value;
    }
    /**
     * Sets the supersedingAppCount property value. The total number of apps directly or indirectly superseding the parent app.
     * @param value Value to set for the supersedingAppCount property.
     * @return a void
     */
    public void setSupersedingAppCount(@javax.annotation.Nullable final Integer value) {
        this._supersedingAppCount = value;
    }
}
