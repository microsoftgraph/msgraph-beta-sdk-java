package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkPosition extends ItemFacet implements Parsable {
    /** Categories that the user has associated with this position. */
    private java.util.List<String> _categories;
    /** Colleagues that are associated with this position. */
    private java.util.List<RelatedPerson> _colleagues;
    /** The detail property */
    private PositionDetail _detail;
    /** Denotes whether or not the position is current. */
    private Boolean _isCurrent;
    /** Contains detail of the user's manager in this position. */
    private RelatedPerson _manager;
    /**
     * Instantiates a new WorkPosition and sets the default values.
     * @return a void
     */
    public WorkPosition() {
        super();
        this.setOdataType("#microsoft.graph.workPosition");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WorkPosition
     */
    @javax.annotation.Nonnull
    public static WorkPosition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkPosition();
    }
    /**
     * Gets the categories property value. Categories that the user has associated with this position.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getCategories() {
        return this._categories;
    }
    /**
     * Gets the colleagues property value. Colleagues that are associated with this position.
     * @return a relatedPerson
     */
    @javax.annotation.Nullable
    public java.util.List<RelatedPerson> getColleagues() {
        return this._colleagues;
    }
    /**
     * Gets the detail property value. The detail property
     * @return a positionDetail
     */
    @javax.annotation.Nullable
    public PositionDetail getDetail() {
        return this._detail;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkPosition currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("categories", (n) -> { currentObject.setCategories(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("colleagues", (n) -> { currentObject.setColleagues(n.getCollectionOfObjectValues(RelatedPerson::createFromDiscriminatorValue)); });
            this.put("detail", (n) -> { currentObject.setDetail(n.getObjectValue(PositionDetail::createFromDiscriminatorValue)); });
            this.put("isCurrent", (n) -> { currentObject.setIsCurrent(n.getBooleanValue()); });
            this.put("manager", (n) -> { currentObject.setManager(n.getObjectValue(RelatedPerson::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isCurrent property value. Denotes whether or not the position is current.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsCurrent() {
        return this._isCurrent;
    }
    /**
     * Gets the manager property value. Contains detail of the user's manager in this position.
     * @return a relatedPerson
     */
    @javax.annotation.Nullable
    public RelatedPerson getManager() {
        return this._manager;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("categories", this.getCategories());
        writer.writeCollectionOfObjectValues("colleagues", this.getColleagues());
        writer.writeObjectValue("detail", this.getDetail());
        writer.writeBooleanValue("isCurrent", this.getIsCurrent());
        writer.writeObjectValue("manager", this.getManager());
    }
    /**
     * Sets the categories property value. Categories that the user has associated with this position.
     * @param value Value to set for the categories property.
     * @return a void
     */
    public void setCategories(@javax.annotation.Nullable final java.util.List<String> value) {
        this._categories = value;
    }
    /**
     * Sets the colleagues property value. Colleagues that are associated with this position.
     * @param value Value to set for the colleagues property.
     * @return a void
     */
    public void setColleagues(@javax.annotation.Nullable final java.util.List<RelatedPerson> value) {
        this._colleagues = value;
    }
    /**
     * Sets the detail property value. The detail property
     * @param value Value to set for the detail property.
     * @return a void
     */
    public void setDetail(@javax.annotation.Nullable final PositionDetail value) {
        this._detail = value;
    }
    /**
     * Sets the isCurrent property value. Denotes whether or not the position is current.
     * @param value Value to set for the isCurrent property.
     * @return a void
     */
    public void setIsCurrent(@javax.annotation.Nullable final Boolean value) {
        this._isCurrent = value;
    }
    /**
     * Sets the manager property value. Contains detail of the user's manager in this position.
     * @param value Value to set for the manager property.
     * @return a void
     */
    public void setManager(@javax.annotation.Nullable final RelatedPerson value) {
        this._manager = value;
    }
}
