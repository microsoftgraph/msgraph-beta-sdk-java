package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SynchronizationJobApplicationParameters implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The identifier of a the synchronizationRule to be applied.  */
    private String _ruleId;
    /** The identifiers of one or more objects to which a synchronizationJob is to be applied.  */
    private java.util.List<SynchronizationJobSubject> _subjects;
    /**
     * Instantiates a new synchronizationJobApplicationParameters and sets the default values.
     * @return a void
     */
    public SynchronizationJobApplicationParameters() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a synchronizationJobApplicationParameters
     */
    @javax.annotation.Nonnull
    public static SynchronizationJobApplicationParameters createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationJobApplicationParameters();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SynchronizationJobApplicationParameters currentObject = this;
        return new HashMap<>(2) {{
            this.put("ruleId", (n) -> { currentObject.setRuleId(n.getStringValue()); });
            this.put("subjects", (n) -> { currentObject.setSubjects(n.getCollectionOfObjectValues(SynchronizationJobSubject::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the ruleId property value. The identifier of a the synchronizationRule to be applied.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRuleId() {
        return this._ruleId;
    }
    /**
     * Gets the subjects property value. The identifiers of one or more objects to which a synchronizationJob is to be applied.
     * @return a synchronizationJobSubject
     */
    @javax.annotation.Nullable
    public java.util.List<SynchronizationJobSubject> getSubjects() {
        return this._subjects;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("ruleId", this.getRuleId());
        writer.writeCollectionOfObjectValues("subjects", this.getSubjects());
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
     * Sets the ruleId property value. The identifier of a the synchronizationRule to be applied.
     * @param value Value to set for the ruleId property.
     * @return a void
     */
    public void setRuleId(@javax.annotation.Nullable final String value) {
        this._ruleId = value;
    }
    /**
     * Sets the subjects property value. The identifiers of one or more objects to which a synchronizationJob is to be applied.
     * @param value Value to set for the subjects property.
     * @return a void
     */
    public void setSubjects(@javax.annotation.Nullable final java.util.List<SynchronizationJobSubject> value) {
        this._subjects = value;
    }
}
