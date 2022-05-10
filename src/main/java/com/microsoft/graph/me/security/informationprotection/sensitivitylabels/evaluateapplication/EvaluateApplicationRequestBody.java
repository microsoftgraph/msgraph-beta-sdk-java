package microsoft.graph.me.security.informationprotection.sensitivitylabels.evaluateapplication;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.security.ContentInfo;
import microsoft.graph.models.security.LabelingOptions;
/** Provides operations to call the evaluateApplication method. */
public class EvaluateApplicationRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The contentInfo property */
    private ContentInfo _contentInfo;
    /** The labelingOptions property */
    private LabelingOptions _labelingOptions;
    /**
     * Instantiates a new evaluateApplicationRequestBody and sets the default values.
     * @return a void
     */
    public EvaluateApplicationRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a evaluateApplicationRequestBody
     */
    @javax.annotation.Nonnull
    public static EvaluateApplicationRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EvaluateApplicationRequestBody();
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
     * Gets the contentInfo property value. The contentInfo property
     * @return a contentInfo
     */
    @javax.annotation.Nullable
    public ContentInfo getContentInfo() {
        return this._contentInfo;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EvaluateApplicationRequestBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("contentInfo", (n) -> { currentObject.setContentInfo(n.getObjectValue(ContentInfo::createFromDiscriminatorValue)); });
            this.put("labelingOptions", (n) -> { currentObject.setLabelingOptions(n.getObjectValue(LabelingOptions::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the labelingOptions property value. The labelingOptions property
     * @return a labelingOptions
     */
    @javax.annotation.Nullable
    public LabelingOptions getLabelingOptions() {
        return this._labelingOptions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("contentInfo", this.getContentInfo());
        writer.writeObjectValue("labelingOptions", this.getLabelingOptions());
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
     * Sets the contentInfo property value. The contentInfo property
     * @param value Value to set for the contentInfo property.
     * @return a void
     */
    public void setContentInfo(@javax.annotation.Nullable final ContentInfo value) {
        this._contentInfo = value;
    }
    /**
     * Sets the labelingOptions property value. The labelingOptions property
     * @param value Value to set for the labelingOptions property.
     * @return a void
     */
    public void setLabelingOptions(@javax.annotation.Nullable final LabelingOptions value) {
        this._labelingOptions = value;
    }
}
