package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Tasks extends Entity implements Parsable {
    /** All tasks in the users mailbox. */
    private java.util.List<BaseTask> _alltasks;
    /** The task lists in the users mailbox. */
    private java.util.List<BaseTaskList> _lists;
    /**
     * Instantiates a new tasks and sets the default values.
     * @return a void
     */
    public Tasks() {
        super();
        this.setOdataType("#microsoft.graph.tasks");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a tasks
     */
    @javax.annotation.Nonnull
    public static Tasks createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Tasks();
    }
    /**
     * Gets the alltasks property value. All tasks in the users mailbox.
     * @return a baseTask
     */
    @javax.annotation.Nullable
    public java.util.List<BaseTask> getAlltasks() {
        return this._alltasks;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Tasks currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("alltasks", (n) -> { currentObject.setAlltasks(n.getCollectionOfObjectValues(BaseTask::createFromDiscriminatorValue)); });
            this.put("lists", (n) -> { currentObject.setLists(n.getCollectionOfObjectValues(BaseTaskList::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the lists property value. The task lists in the users mailbox.
     * @return a baseTaskList
     */
    @javax.annotation.Nullable
    public java.util.List<BaseTaskList> getLists() {
        return this._lists;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("alltasks", this.getAlltasks());
        writer.writeCollectionOfObjectValues("lists", this.getLists());
    }
    /**
     * Sets the alltasks property value. All tasks in the users mailbox.
     * @param value Value to set for the alltasks property.
     * @return a void
     */
    public void setAlltasks(@javax.annotation.Nullable final java.util.List<BaseTask> value) {
        this._alltasks = value;
    }
    /**
     * Sets the lists property value. The task lists in the users mailbox.
     * @param value Value to set for the lists property.
     * @return a void
     */
    public void setLists(@javax.annotation.Nullable final java.util.List<BaseTaskList> value) {
        this._lists = value;
    }
}
