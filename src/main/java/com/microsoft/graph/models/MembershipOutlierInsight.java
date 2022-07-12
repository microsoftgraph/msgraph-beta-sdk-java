package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MembershipOutlierInsight extends GovernanceInsight implements Parsable {
    /** The container property */
    private DirectoryObject _container;
    /** The containerId property */
    private String _containerId;
    /** The member property */
    private DirectoryObject _member;
    /** The memberId property */
    private String _memberId;
    /** The outlierContainerType property */
    private OutlierContainerType _outlierContainerType;
    /** The outlierMemberType property */
    private OutlierMemberType _outlierMemberType;
    /**
     * Instantiates a new MembershipOutlierInsight and sets the default values.
     * @return a void
     */
    public MembershipOutlierInsight() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MembershipOutlierInsight
     */
    @javax.annotation.Nonnull
    public static MembershipOutlierInsight createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MembershipOutlierInsight();
    }
    /**
     * Gets the container property value. The container property
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public DirectoryObject getContainer() {
        return this._container;
    }
    /**
     * Gets the containerId property value. The containerId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContainerId() {
        return this._containerId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MembershipOutlierInsight currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("container", (n) -> { currentObject.setContainer(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("containerId", (n) -> { currentObject.setContainerId(n.getStringValue()); });
            this.put("member", (n) -> { currentObject.setMember(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("memberId", (n) -> { currentObject.setMemberId(n.getStringValue()); });
            this.put("outlierContainerType", (n) -> { currentObject.setOutlierContainerType(n.getEnumValue(OutlierContainerType.class)); });
            this.put("outlierMemberType", (n) -> { currentObject.setOutlierMemberType(n.getEnumValue(OutlierMemberType.class)); });
        }};
    }
    /**
     * Gets the member property value. The member property
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public DirectoryObject getMember() {
        return this._member;
    }
    /**
     * Gets the memberId property value. The memberId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMemberId() {
        return this._memberId;
    }
    /**
     * Gets the outlierContainerType property value. The outlierContainerType property
     * @return a outlierContainerType
     */
    @javax.annotation.Nullable
    public OutlierContainerType getOutlierContainerType() {
        return this._outlierContainerType;
    }
    /**
     * Gets the outlierMemberType property value. The outlierMemberType property
     * @return a outlierMemberType
     */
    @javax.annotation.Nullable
    public OutlierMemberType getOutlierMemberType() {
        return this._outlierMemberType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("container", this.getContainer());
        writer.writeStringValue("containerId", this.getContainerId());
        writer.writeObjectValue("member", this.getMember());
        writer.writeStringValue("memberId", this.getMemberId());
        writer.writeEnumValue("outlierContainerType", this.getOutlierContainerType());
        writer.writeEnumValue("outlierMemberType", this.getOutlierMemberType());
    }
    /**
     * Sets the container property value. The container property
     * @param value Value to set for the container property.
     * @return a void
     */
    public void setContainer(@javax.annotation.Nullable final DirectoryObject value) {
        this._container = value;
    }
    /**
     * Sets the containerId property value. The containerId property
     * @param value Value to set for the containerId property.
     * @return a void
     */
    public void setContainerId(@javax.annotation.Nullable final String value) {
        this._containerId = value;
    }
    /**
     * Sets the member property value. The member property
     * @param value Value to set for the member property.
     * @return a void
     */
    public void setMember(@javax.annotation.Nullable final DirectoryObject value) {
        this._member = value;
    }
    /**
     * Sets the memberId property value. The memberId property
     * @param value Value to set for the memberId property.
     * @return a void
     */
    public void setMemberId(@javax.annotation.Nullable final String value) {
        this._memberId = value;
    }
    /**
     * Sets the outlierContainerType property value. The outlierContainerType property
     * @param value Value to set for the outlierContainerType property.
     * @return a void
     */
    public void setOutlierContainerType(@javax.annotation.Nullable final OutlierContainerType value) {
        this._outlierContainerType = value;
    }
    /**
     * Sets the outlierMemberType property value. The outlierMemberType property
     * @param value Value to set for the outlierMemberType property.
     * @return a void
     */
    public void setOutlierMemberType(@javax.annotation.Nullable final OutlierMemberType value) {
        this._outlierMemberType = value;
    }
}
